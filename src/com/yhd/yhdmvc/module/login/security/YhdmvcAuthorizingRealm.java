package com.yhd.yhdmvc.module.login.security;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.yhd.yhdmvc.module.login.entity.YhdmvcUser;
import com.yhd.yhdmvc.module.login.manager.YhdmvcUserManager;

public class YhdmvcAuthorizingRealm extends AuthorizingRealm {

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authToken) throws AuthenticationException {

		UsernamePasswordToken token = (UsernamePasswordToken) authToken;
//		FlxoaUser flxoaUser = flxoaUserMng.findByUserName(token.getUsername());
		YhdmvcUser flxoaUser = yhdmvcUserManager.findByUserName(token.getUsername());

		if (flxoaUser != null) {
			return new SimpleAuthenticationInfo(flxoaUser.getDisplayName(),
					flxoaUser.getPassword(), getName());
		}

		return null;
	}

	protected YhdmvcUserManager yhdmvcUserManager;

	@Autowired
	public void setFlxoaUserMng(YhdmvcUserManager yhdmvcUserManager) {
		this.yhdmvcUserManager = yhdmvcUserManager;
	}

}
