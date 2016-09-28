package com.mamba.usm.dao;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mamba.usm.entity.UsmAdmin;
import com.mamba.usm.entity.UsmAdminExample;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-dao.xml"})
public class UsmAdminMapperTest {
	private Logger logger = LoggerFactory.getLogger(getClass());
	@Resource
	private UsmAdminMapper usmAdminMapper;
	
	@Test
	public void testCountByExample() {
		UsmAdminExample example = new UsmAdminExample();
		usmAdminMapper.deleteByExample(example);
		int actual = usmAdminMapper.countByExample(example);
		logger.debug("调用删除后 总数为:{}" ,actual);
		Assert.assertEquals(0, actual);
		UsmAdmin record = new UsmAdmin();
		record.setLoginName("wen");
		record.setLoginPaw("123456");
		usmAdminMapper.insertSelective(record);
		actual = usmAdminMapper.countByExample(example);
		logger.debug("调用新增后 总数为:{}" ,actual);
		Assert.assertEquals(1, actual);
	}

	@Test
	public void testDeleteByExample() {
		UsmAdminExample example = new UsmAdminExample();
		usmAdminMapper.countByExample(example );
	}

	@Test
	public void testInsert() {
		UsmAdminExample example = new UsmAdminExample();
		usmAdminMapper.countByExample(example );
	}

}
