package com.capg.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.Query;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.capg.model.TraineeDetails;

@Component("com.capg")
@ComponentScan("com")
@Repository
public class TraineeDaoImpl implements TraineeDao{
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public int addTrainee(TraineeDetails trainee) {
		// TODO Auto-generated method stub
		entityManager.persist(trainee);
		return 0;
	}

	@Override
	public int updateTrainee(TraineeDetails trainee) {
		// TODO Auto-generated method stub
		entityManager.merge(trainee);
		return 0;
	}

	@Override
	public int deleteTrainee(int id) {
		// TODO Auto-generated method stub
		TraineeDetails t=new TraineeDetails();
		t.setId(id);
		entityManager.remove(t.getId());
		return 0;
	}

	@Override
	public ArrayList<TraineeDetails> getAll() {
		// TODO Auto-generated method stub
		Query query = (Query) entityManager.createQuery("from TraineeDetails ");
		ArrayList<TraineeDetails> list = (ArrayList<TraineeDetails>) query.list();
		return list;
		
	}

	@Override
	public TraineeDetails getById(int id) {
		// TODO Auto-generated method stub
		TraineeDetails tr=entityManager.find(TraineeDetails.class, id);
		return tr;
	}

}
