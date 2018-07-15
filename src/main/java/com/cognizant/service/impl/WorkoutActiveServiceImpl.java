package com.cognizant.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.dao.WorkoutActiveRepository;
import com.cognizant.model.WorkoutActive;
import com.cognizant.service.WorkoutActiveService;

@Service("workoutActiveService")
@Transactional
public class WorkoutActiveServiceImpl implements WorkoutActiveService {

	@Autowired
	private WorkoutActiveRepository workoutActiveRepository;
	
	@Override
	public WorkoutActive startWorkout(WorkoutActive work) {
		work.setStatus(true);
		work.toString();
		return workoutActiveRepository.save(work);
		
	}

	@Override
	public WorkoutActive endWorkout(WorkoutActive work) {
		work.setStatus(false);
		return workoutActiveRepository.save(work);
	}

	@Override
	public List<WorkoutActive> getAllWorkoutActive() {
		return workoutActiveRepository.findAll();
	}

	@Override
	public void deleteWorkoutActive(Long workoutId) {
		List<WorkoutActive> woList = workoutActiveRepository.findRecordsByWorkoutId(workoutId);
		for(WorkoutActive woa: woList) {
			System.out.println(woa.toString());
		}
		workoutActiveRepository.deleteAll(woList);
		
	}

}
