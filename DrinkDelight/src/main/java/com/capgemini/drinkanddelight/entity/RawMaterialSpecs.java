package com.capgemini.drinkanddelight.entity;

import javax.persistence.Entity;


public class RawMaterialSpecs 
{
	private String rmsId;
	private String name;
	private double pricePerUnit;
	private int duration;
	private String description;
	public String getRmsId() {
		return rmsId;
	}
	public void setRmsId(String rmsId) {
		this.rmsId = rmsId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
