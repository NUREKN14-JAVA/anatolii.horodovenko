package com.nixsolutions.usermanagment.db;

import com.mockobjects.dynamic.Mock;
import com.nixsolutions.usermanagment.db.DaoFactory;
import com.nixsolutions.usermanagment.db.UserDao;

public class MockDaoFactory extends DaoFactory {

	private Mock mockUserDao;
	
	public MockDaoFactory(){
		mockUserDao = new Mock(UserDao.class);
	}
	
	public Mock getMockUserDao()
	{
		return mockUserDao;
	}
	
	public UserDao getUserDao() {
		
		return (UserDao) mockUserDao.proxy();
	}

}
