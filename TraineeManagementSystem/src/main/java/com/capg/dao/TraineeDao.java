package com.capg.dao;

import java.util.ArrayList;

import com.capg.model.TraineeDetails;


public interface TraineeDao {
	int addTrainee(TraineeDetails trainee);
    int updateTrainee(TraineeDetails trainee);
	int deleteTrainee(int id);
	ArrayList<TraineeDetails> getAll();
	TraineeDetails getById(int id);
}
