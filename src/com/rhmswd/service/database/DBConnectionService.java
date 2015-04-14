package com.rhmswd.service.database;
import com.mongodb.MongoClient;

public class DBConnectionService {
	
	
	private static MongoClient mongoClient= null;
	private static String mongoIpAddress = "x.x.x.x";
	private static int mongoPort = 111000; 
	
	static{
		try {
			mongoClient = new MongoClient(mongoIpAddress, mongoPort);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public DBConnectionService() {
		// TODO Auto-generated constructor stub
		
		
	}
	
	public synchronized MongoClient getConnection()
	{
		
		return mongoClient;
		
	}
	
	

}



