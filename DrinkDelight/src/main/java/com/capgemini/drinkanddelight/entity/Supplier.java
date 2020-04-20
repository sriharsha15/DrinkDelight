package com.capgemini.drinkanddelight.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supplier {
@Id
private String supplierId;
private String name;
private String Address;
private double phoneNumber;
public String getSupplierId() {
	return supplierId;
}
public void setSupplierId(String supplierId) {
	this.supplierId = supplierId;
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

}
