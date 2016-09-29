package com.mamba.usm.service;

import static org.junit.Assert.*;

import java.io.IOException;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-dubbo-consumers.xml"})
public class UsmAdminServiceTest {
	
	@Resource(name= "demoService")
	UsmAdminService UsmAdminService;
	
	@Test
	public void test() throws IOException {
		UsmAdminService.getCountOfAdmin();
		System.in.read();
	}

}
