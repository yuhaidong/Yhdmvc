package com.yhd.yhdmvc.module.login.manager;

import com.yhd.yhdmvc.module.login.entity.YhdmvcUser;


public interface YhdmvcUserManager {

	public YhdmvcUser findByUserName(String username);
	
	public YhdmvcUser updateYhdmvcUser(YhdmvcUser yhdmvcUser);
}
