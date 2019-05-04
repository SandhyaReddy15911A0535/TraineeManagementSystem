package com.capg.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.model.TraineeDetails;
import com.capg.service.TraineeServiceImpl;
@RestController
public class MyController {
	@Autowired
TraineeServiceImpl service;
	@GetMapping("/")
	public String sayHello()
	{
		return "hello";
	}
	@PostMapping("/add")
	public ResponseEntity add(@RequestBody TraineeDetails trainee)
	{
		service.addTrainee(trainee);
		return new ResponseEntity(HttpStatus.OK);
	}
	@PostMapping("/update")
	public ResponseEntity update(@RequestBody TraineeDetails trainee )
	{
		service.updateTrainee(trainee);
		return new ResponseEntity(HttpStatus.OK);
	}
	@PostMapping("/delete")
	public ResponseEntity delete(@RequestBody int id)
	{
		service.deleteTrainee(id);
		return new ResponseEntity(HttpStatus.OK);
	}
	@PostMapping("/getById")
	public ResponseEntity getById(@RequestBody int id)
	{
		service.getById(id);
		return new ResponseEntity(HttpStatus.OK);
	}
	@PostMapping("/getAll")
	public ArrayList<TraineeDetails> getAll()
	{
		ArrayList<TraineeDetails> allTrainees=service.getAll();
		return allTrainees;
	}
	
}
