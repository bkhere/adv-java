package com.customer.dto;

public class CustomerDTO {
	private String name;
	private String city;
	private String subscriptionType;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		name = Name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
		public String getSubscriptionType() {
		return subscriptionType;
	}
	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
