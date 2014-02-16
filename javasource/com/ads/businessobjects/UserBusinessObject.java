package com.ads.businessobjects;

import com.ads.businessentities.User;

public class UserBusinessObject implements IBusinessObject
{
	//User variable
	private User user;
	public UserBusinessObject()
	{
	
	}
	public UserBusinessObject(User user)
	{
		this.user = user;	
	}
	public User Add()
	{
		return Add(user);
	}
	public User Add(User user)
	{
		user.setId(101);
		return user;	
	}

}
