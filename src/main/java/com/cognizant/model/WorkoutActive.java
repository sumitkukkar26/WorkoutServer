package com.cognizant.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="workout_active")
@IdClass(WorkoutActivePK.class)
public class WorkoutActive {
	
	@OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "workout_id")
	private Workout workout;
	
	@Id
	@Column(name="start_date")
	private LocalDate startDate;
	
	@Id
	@Column(name="start_time")
	private LocalTime startTime;
	
	@Column(name="end_date")
	private LocalDate endDate;
	
	@Column(name="end_time")
	private LocalTime endTime;
	
	@Column(name="comment", length=64)
	private String comment;
	
	@Column(name="status")
	private boolean status;
	
	public Workout getWorkout() {
		return workout;
	}
	public void setWorkoutId(Workout workout) {
		this.workout = workout;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "WorkoutActive [workoutId=" + workout.toString() + ", startDate=" + startDate + ", startTime=" + startTime
				+ ", endDate=" + endDate + ", endTime=" + endTime + ", comment=" + comment + ", status=" + status + "]";
	}

}
