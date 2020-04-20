package com.capgemini.drinkanddelight.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Distributor {
	@Id
	private String distributorId;
	private String name;
	private String Address;
	private double phoneNumber;
	public String getDistributorId() {
		return distributorId;
	}
	public void setDistributorId(String distributorId) {
		this.distributorId = distributorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public double getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Distributor [distributorId=" + distributorId + ", name=" + name + ", Address=" + Address
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
