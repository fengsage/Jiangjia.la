/**
 * www.yiji.com Inc.
 * Copyright (c) 2012 All Rights Reserved.
 */
package com.peigen.web.depreciate.form;

import java.io.Serializable;

/**
 *                       
 * @Filename UserSignupForm.java
 *
 * @Description 
 *
 * @Version 1.0
 *
 * @Author peigen
 *
 * @Email peigen@yiji.com
 *       
 * @History
 *<li>Author: peigen</li>
 *<li>Date: 2012-8-16</li>
 *<li>Version: 1.0</li>
 *<li>Content: create</li>
 *
 */
public class UserSignupForm implements Serializable {
	
	/** Comment for <code>serialVersionUID</code> */
	private static final long	serialVersionUID	= -7048861201689995941L;
	
	private String				email;
	
	private String				password;
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("UserSignupForm [email=%s, password=%s]", email, password);
	}
	
}
