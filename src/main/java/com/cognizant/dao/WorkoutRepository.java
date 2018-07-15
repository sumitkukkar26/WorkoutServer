package com.cognizant.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Workout;

@Repository
public interface WorkoutRepository extends JpaRepository<Workout, Long> {

}
