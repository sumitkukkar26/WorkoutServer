package com.cognizant.service;

import java.util.List;
import java.util.Optional;

import com.cognizant.model.Workout;

public interface WorkoutService {
	
	public List<Workout> getAllWorkouts();
	
	public Workout addWorkout(Workout work);
	
	public void deleteWorkout(Workout work);

	public Optional<Workout> findWorkoutById(long id);
}
