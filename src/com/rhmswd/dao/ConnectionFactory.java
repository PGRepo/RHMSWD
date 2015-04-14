package com.rhmswd.dao;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public enum ConnectionFactory {
	CONNECTION;
    private MongoClient client = null;
    private MongoClientURI uri = null;

    private ConnectionFactory() {
        try {
            //client = new MongoClient("10.233.97.167" , 56408);
            //client = new MongoClient("10.233.97.167" , 27017);
        	String textUri ="mongodb://aneri:aneri@ds045001.mongolab.com:45001/rhmswd";
        	
        	uri = new MongoClientURI(textUri);
        	client = new MongoClient(uri);
        	
        	
        	
        	//client = new MongoClient(uri);
        	
        	
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public MongoClientURI getMongoURI() {
        if (uri == null)
            throw new RuntimeException();
        return uri;
    }

    public MongoClient getMongoClient() {
        if (client == null)
            throw new RuntimeException();
        return client;
    }
}
