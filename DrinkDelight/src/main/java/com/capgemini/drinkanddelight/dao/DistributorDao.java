package com.capgemini.drinkanddelight.dao;

import java.util.List;

import com.capgemini.drinkanddelight.entity.Distributor;

public interface DistributorDao 
{
	public void create(Distributor distributor);
	public String display(String distributorId);
	public List<Distributor> displayAll();
}
