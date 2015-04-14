package com.rhmswd.bean;

import java.util.Date;

public class User {
	private String email_id;
	private String first_name;
	private String last_name;
	private String address;
	private int contact_number;
	private int emergency_contact_number;
	private String emergency_email_id;
	private int age;
	private char gender;
	private int weight;
	private String nationality;
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmergency_email_id() {
		return emergency_email_id;
	}
	public void setEmergency_email_id(String emergency_email_id) {
		this.emergency_email_id = emergency_email_id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getFirst_Name() {
		return first_name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_name = first_Name;
	}
	public String getLast_Name() {
		return last_name;
	}
	public void setLast_Name(String last_Name) {
		this.last_name = last_Name;
	}
	private Double latitude;
	private Double longitude;
	private int heart_rate;
	private Date time_stamp;
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContact_number() {
		return contact_number;
	}
	public void setContact_number(int contact_number) {
		this.contact_number = contact_number;
	}
	public int getEmergency_contact_number() {
		return emergency_contact_number;
	}
	public void setEmergency_contact_number(int emergency_contact_number) {
		this.emergency_contact_number = emergency_contact_number;
	}
	public int getHeart_rate() {
		return heart_rate;
	}
	public void setHeart_rate(int heart_rate) {
		this.heart_rate = heart_rate;
	}
	public Date getTime_stamp() {
		return time_stamp;
	}
	public void setTime_stamp(Date time_stamp) {
		this.time_stamp = time_stamp;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	@Override
	public String toString()
	{
		return "email_idebu";
	}

}
