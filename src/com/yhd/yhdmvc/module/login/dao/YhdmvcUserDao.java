package com.yhd.yhdmvc.module.login.dao;

import com.yhd.yhdmvc.module.login.entity.YhdmvcUser;

public interface YhdmvcUserDao {

	public YhdmvcUser findByUserName(String username);
	
	public YhdmvcUser updateYhdmvcUser(YhdmvcUser yhdmvcUser);
}
