package com.yhd.yhdmvc.module.login.entity.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the yhdmvc_user table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="yhdmvc_user"
 */

public abstract class BaseYhdmvcUser  implements Serializable {

	public static String REF = "YhdmvcUser";
	public static String PROP_DESCRIPTION = "Description";
	public static String PROP_LOGIN_NAME = "LoginName";
	public static String PROP_PASSWORD = "Password";
	public static String PROP_UPDATE_TIME = "UpdateTime";
	public static String PROP_ID = "Id";
	public static String PROP_DISPLAY_NAME = "DisplayName";


	// constructors
	public BaseYhdmvcUser () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseYhdmvcUser (java.lang.String id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.String id;

	// fields
	private java.lang.String loginName;
	private java.lang.String displayName;
	private java.lang.String password;
	private java.util.Date updateTime;
	private java.lang.String description;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="uuid"
     *  column="id"
     */
	public java.lang.String getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (java.lang.String id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: login_name
	 */
	public java.lang.String getLoginName () {
		return loginName;
	}

	/**
	 * Set the value related to the column: login_name
	 * @param loginName the login_name value
	 */
	public void setLoginName (java.lang.String loginName) {
		this.loginName = loginName;
	}



	/**
	 * Return the value associated with the column: display_name
	 */
	public java.lang.String getDisplayName () {
		return displayName;
	}

	/**
	 * Set the value related to the column: display_name
	 * @param displayName the display_name value
	 */
	public void setDisplayName (java.lang.String displayName) {
		this.displayName = displayName;
	}



	/**
	 * Return the value associated with the column: password
	 */
	public java.lang.String getPassword () {
		return password;
	}

	/**
	 * Set the value related to the column: password
	 * @param password the password value
	 */
	public void setPassword (java.lang.String password) {
		this.password = password;
	}



	/**
	 * Return the value associated with the column: update_time
	 */
	public java.util.Date getUpdateTime () {
		return updateTime;
	}

	/**
	 * Set the value related to the column: update_time
	 * @param updateTime the update_time value
	 */
	public void setUpdateTime (java.util.Date updateTime) {
		this.updateTime = updateTime;
	}



	/**
	 * Return the value associated with the column: description
	 */
	public java.lang.String getDescription () {
		return description;
	}

	/**
	 * Set the value related to the column: description
	 * @param description the description value
	 */
	public void setDescription (java.lang.String description) {
		this.description = description;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.yhd.yhdmvc.module.login.entity.YhdmvcUser)) return false;
		else {
			com.yhd.yhdmvc.module.login.entity.YhdmvcUser yhdmvcUser = (com.yhd.yhdmvc.module.login.entity.YhdmvcUser) obj;
			if (null == this.getId() || null == yhdmvcUser.getId()) return false;
			else return (this.getId().equals(yhdmvcUser.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}