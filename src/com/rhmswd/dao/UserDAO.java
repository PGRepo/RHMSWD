package com.rhmswd.dao;

import java.util.List;

import com.rhmswd.bean.User;
import com.rhmswd.bean.UserData;

public interface UserDAO {
	
	List<User> findAll();
	boolean createUser(User user);
	boolean updateUserInfo();
	boolean deleteUser();
	boolean processHeartRate(UserData user_data);
	

}
