package com.rhmswd.dao.impl;
import java.util.List;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.WriteConcern;
import com.rhmswd.bean.User;
import com.rhmswd.bean.UserData;
import com.rhmswd.dao.*;
import com.rhmswd.service.database.DBConnectionService;

public class UserDAOimpl implements UserDAO
{
	
	private String databaseName;
	private String collectionName;

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createUser(User user) {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public boolean updateUserInfo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean processHeartRate(UserData user_data) {
		// TODO Auto-generated method stub
		
		Gson gson = new Gson();
		String json = gson.toJson(user_data);	
		System.out.println("Converted Json format:  "+ json);
		
		// get mongo client....
	 	//MongoClient mongoClient = ConnectionFactory.CONNECTION.getClient();
		
		MongoClientURI uri = ConnectionFactory.CONNECTION.getMongoURI();
	 	
	 	// get database
	 	//String uri = "mongodb://admin:password@ds041177.mongolab.com:41177/myclouddb";
	 	MongoClient mongoClient = ConnectionFactory.CONNECTION.getMongoClient();
	 	DB dbObj = mongoClient.getDB(uri.getDatabase());
	 	
	 	//DB dbObj = mongoClient.getDB( "RHMSWD" );
	 	DBCollection coll = dbObj.getCollection("User_Data");
	 	BasicDBObject wrapper_document = new BasicDBObject();
	 	wrapper_document.put("email_id", user_data.getEmail_id());
	 	wrapper_document.put("latitude", user_data.getLatitude());
	 	wrapper_document.put("longitude", user_data.getLongitude());
	 	wrapper_document.put("time_stamp", user_data.getTime_stamp());
	 	
	 	BasicDBObject sub_document = new BasicDBObject();
	 	sub_document.put("heart_rate", user_data.getData().getHeart_rate());
	 	sub_document.put("avg_heart_rate", user_data.getData().getAvg_heart_rate());
	 	
	 	wrapper_document.put("data", sub_document);
	 	coll.insert(wrapper_document);
		
		
		
		/*{
		 * "emailid": ""
		 * "name":"" 
		 * "address":""
		 * "contact_number":""
		 * "emergency_contact_number":""
		 * "info": {
		 * 				time_stamp1: {
		 * 									"heartRate":
		 * 									"latitude":
		 * 									"longitude":
		 * 							}
		 * 				time_stamp2: {
		 * 									"heartRate":
		 * 									"latitude":
		 * 									"longitude":
		 * 							}
		 * 		}
		 * 
			
		}*/
		
		
		
		
		
		return false;
		
	}
	
	
	
	public DB getDatabase(MongoClient mongoClient, String DatabaseName)
	{
		return mongoClient.getDB(DatabaseName);
		
	}
	
	public DBCollection getCollection(String collectionName, DB database)
	{
		return database.getCollection(collectionName);
		
	}
	
	
	
	

}
