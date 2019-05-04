package com.capg.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.capg.dao.TraineeDao;
import com.capg.model.TraineeDetails;

public class TraineeServiceImpl implements TraineeService{

	@Autowired
	TraineeDao dao;
	@Override
	public int addTrainee(TraineeDetails trainee) {
		// TODO Auto-generated method stub
		return dao.addTrainee(trainee);
	}

	@Override
	public int updateTrainee(TraineeDetails trainee) {
		// TODO Auto-generated method stub
		return dao.updateTrainee(trainee);
	}

	@Override
	public int deleteTrainee(int id) {
		// TODO Auto-generated method stub
		return dao.deleteTrainee(id);
	}

	@Override
	public ArrayList<TraineeDetails> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	@Override
	public TraineeDetails getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
