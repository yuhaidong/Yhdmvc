package com.yhd.yhdmvc.module.login.entity;

import com.yhd.yhdmvc.common.hibernate3.PriorityInterface;
import com.yhd.yhdmvc.module.login.entity.base.BaseYhdmvcUser;

public class YhdmvcUser extends BaseYhdmvcUser implements PriorityInterface {
	private static final long serialVersionUID = 1L;

	/* [CONSTRUCTOR MARKER BEGIN] */
	public YhdmvcUser () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public YhdmvcUser (java.lang.String id) {
		super(id);
	}

	/* [CONSTRUCTOR MARKER END] */

	@Override
	public Number getPriority() {
		return 0;
	}

}