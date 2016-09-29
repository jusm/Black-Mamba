package com.mamba.usm.service.impl;

import javax.annotation.Resource;

import com.mamba.usm.dao.UsmAdminMapper;
import com.mamba.usm.service.UsmAdminService;

public class UsmAdminServiceImpl implements UsmAdminService {
	
	@Resource
	private UsmAdminMapper  usmAdminMapper;
	
	@Override
	public int getCountOfAdmin() {
		return usmAdminMapper.countByExample(null);
	}

}
