package com.yhd.yhdmvc.module.login.dao.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import com.yhd.yhdmvc.common.hibernate3.HibernateBaseDao;
import com.yhd.yhdmvc.common.hibernate3.Updater;
import com.yhd.yhdmvc.module.login.dao.YhdmvcUserDao;
import com.yhd.yhdmvc.module.login.entity.YhdmvcUser;

@Repository
public class YhdmvcUserDaoImpl extends HibernateBaseDao<YhdmvcUser, Integer> implements
		YhdmvcUserDao {

	@Override
	public YhdmvcUser findByUserName(String username){
		YhdmvcUser yhdmvcUser = findUniqueByPropery(YhdmvcUser.PROP_LOGIN_NAME, username);
		
		return yhdmvcUser;
	}
	
	@Override
	public YhdmvcUser updateYhdmvcUser(YhdmvcUser yhdmvcUser) {
		
		Updater<YhdmvcUser> updater = new Updater<YhdmvcUser>(yhdmvcUser);
		yhdmvcUser = updateByUpdater(updater);
		
		return yhdmvcUser;
	}
	
	@Override
	protected Class<YhdmvcUser> getEntityClass() {

		return YhdmvcUser.class;
	}
}
