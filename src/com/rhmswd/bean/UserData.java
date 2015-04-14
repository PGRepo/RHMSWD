package com.rhmswd.bean;

import java.util.Date;

public class UserData {
	private String email_id;
	private String latitude;
	private String longitude;
	private Data data;
	private String time_stamp;
	
	
	/*private int heart_rate;
	private double avg_heart_rate;*/
	
	
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	/*public int getHeart_rate() {
		return heart_rate;
	}
	public void setHeart_rate(int heart_rate) {
		this.heart_rate = heart_rate;
	}
	public double getAvg_heart_rate() {
		return avg_heart_rate;
	}
	public void setAvg_heart_rate(double avg_heart_rate) {
		this.avg_heart_rate = avg_heart_rate;
	}
	*/
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public String getTime_stamp() {
		return time_stamp;
	}
	public void setTime_stamp(String time_stamp) {
		this.time_stamp = time_stamp;
	}
	
	

}
