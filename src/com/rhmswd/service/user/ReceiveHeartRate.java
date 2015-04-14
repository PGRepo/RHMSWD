package com.rhmswd.service.user;

import com.google.gson.Gson;
import com.rhmswd.bean.Data;
import com.rhmswd.bean.UserData;
import com.rhmswd.dao.impl.UserDAOimpl;

public class ReceiveHeartRate {
	
	public void processHeartRate(String parameters)
	{
		 Gson gson = new Gson();
		  System.out.println("Received Heart Rate:" + parameters);
		
		  UserData user_data_obj;
		  
		  user_data_obj = gson.fromJson(parameters, UserData.class);
		  System.out.println("User email id is: " + user_data_obj.getEmail_id());
		  System.out.println("User Latitude is" + user_data_obj.getLatitude());
		  System.out.println("User Longitude is" + user_data_obj.getLongitude());
		  System.out.println("User data time stamp: "+ user_data_obj.getTime_stamp());
		  Data d = user_data_obj.getData();
		  System.out.println("User Heart Rate is" + d.getHeart_rate());
		  System.out.println("User Avg. Heart Rate is"+ d.getAvg_heart_rate());
		   UserDAOimpl user_dao_impl = new UserDAOimpl();
		   user_dao_impl.processHeartRate(user_data_obj);
		  
		  
		  // call DAO impl to persist the data
	}

}
