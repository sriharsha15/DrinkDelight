package com.capgemini.drinkanddelight.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.drinkanddelight.entity.Distributor;
@Repository
public class DistributorDaoImpl implements DistributorDao
{
	@PersistenceContext
	EntityManager em;
	@Override
	public void create(Distributor distributor) {
		// TODO Auto-generated method stub
		em.persist(distributor);
		
	}

	@Override
	public String display(String distributorId) {
		// TODO Auto-generated method stub
		Distributor distributor = em.find(Distributor.class, distributorId);
		return distributor.toString();
		

}
	public List<Distributor> displayAll() {
		
		String Qstr = "SELECT distributor FROM Distributor distributor";
		TypedQuery<Distributor> query = em.createQuery(Qstr, Distributor.class);
		return query.getResultList();	
}
	
}
