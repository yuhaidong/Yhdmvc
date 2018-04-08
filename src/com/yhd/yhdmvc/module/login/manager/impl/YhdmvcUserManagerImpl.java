package com.yhd.yhdmvc.module.login.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhd.yhdmvc.module.login.dao.YhdmvcUserDao;
import com.yhd.yhdmvc.module.login.entity.YhdmvcUser;
import com.yhd.yhdmvc.module.login.manager.YhdmvcUserManager;

@Service
@Transactional
public class YhdmvcUserManagerImpl implements YhdmvcUserManager {

	@Autowired
	public void setBloUserDao(YhdmvcUserDao yhdmvcUserDao) {
		this.dao = yhdmvcUserDao;
	}

	@Override
	@Transactional(readOnly = true)
	public YhdmvcUser findByUserName(String username) {
		YhdmvcUser entity = dao.findByUserName(username);
		return entity;
	}
	
	public YhdmvcUser updateYhdmvcUser(YhdmvcUser yhdmvcUser) {
		
		YhdmvcUser user = dao.updateYhdmvcUser(yhdmvcUser);
		
		return user;
	}

	private YhdmvcUserDao dao;

	@Autowired
	public void setDao(YhdmvcUserDao dao) {
		this.dao = dao;
	}

	public YhdmvcUserDao getDao() {
		return dao;
	}
}
