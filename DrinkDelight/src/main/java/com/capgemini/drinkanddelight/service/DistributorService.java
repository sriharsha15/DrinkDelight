package com.capgemini.drinkanddelight.service;

import java.util.List;

import com.capgemini.drinkanddelight.entity.Distributor;

public interface DistributorService 
{
	public Distributor create(Distributor distributor);
	public String display(String distributorId);
	public List<Distributor> displayAll();
}
