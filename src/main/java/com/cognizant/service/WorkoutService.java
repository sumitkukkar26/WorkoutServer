package com.cognizant.service;

import java.util.List;
import java.util.Optional;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import com.cognizant.model.Workout;

@CacheConfig(cacheNames={"workout"})
public interface WorkoutService {
	
	@Cacheable
	public List<Workout> getAllWorkouts();
	
	public Workout addWorkout(Workout work);
	
	public void deleteWorkout(Workout work);

	public Optional<Workout> findWorkoutById(long id);
}
