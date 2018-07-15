package com.cognizant.service;

import java.util.List;

import com.cognizant.model.WorkoutActive;

public interface WorkoutActiveService {
	
	public WorkoutActive startWorkout(WorkoutActive work);
	
	public WorkoutActive endWorkout(WorkoutActive work);
	
	public List<WorkoutActive> getAllWorkoutActive();
	
	public void deleteWorkoutActive(Long workoutId);
	

}
