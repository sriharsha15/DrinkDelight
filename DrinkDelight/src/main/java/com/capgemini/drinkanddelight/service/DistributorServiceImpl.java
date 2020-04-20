package com.capgemini.drinkanddelight.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.drinkanddelight.dao.DistributorDao;
import com.capgemini.drinkanddelight.entity.Distributor;

@Transactional
@Service
public class DistributorServiceImpl implements DistributorService
{
@Autowired
private DistributorDao distributordao;
	@Override
	public Distributor create(Distributor distributor) {
		// TODO Auto-generated method stub
		distributordao.create(distributor);
		return distributor;
	}

	@Override
	public String display(String distributorId) {
		// TODO Auto-generated method stub
		
		return distributordao.display(distributorId);
	}
	public List<Distributor> displayAll() {
		// TODO Auto-generated method stub
		
		return distributordao.displayAll();
	}


}
