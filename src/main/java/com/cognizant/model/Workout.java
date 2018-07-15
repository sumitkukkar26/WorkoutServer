package com.cognizant.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="workout_collection")
public class Workout {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="workout_id")
	private Long workoutId;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="category_id")
	private Category category;
	
	@Column(name="workout_title", length=128)
	private String workoutTitle;
	
	@Column(name="workout_note", length=256)
	private String workoutNote;
	
	@Column(name="calories_burn_per_min")
	private Float caloriesBurnPerMin;
	
	public Long getWorkoutId() {
		return workoutId;
	}
	public void setWorkoutId(Long workoutId) {
		this.workoutId = workoutId;
	}
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getWorkoutTitle() {
		return workoutTitle;
	}
	public void setWorkoutTitle(String workoutTitle) {
		this.workoutTitle = workoutTitle;
	}
	public String getWorkoutNote() {
		return workoutNote;
	}
	public void setWorkoutNote(String workoutNote) {
		this.workoutNote = workoutNote;
	}
	public float getCaloriesBurnPerMin() {
		return caloriesBurnPerMin;
	}
	public void setCaloriesBurnPerMin(float caloriesBurnPerMin) {
		this.caloriesBurnPerMin = caloriesBurnPerMin;
	}
	
	@Override
	public String toString() {
		return "Workout [workoutId=" + workoutId + ", category=" + category.toString()+ ", workoutTitle=" + workoutTitle
				+ ", workoutNote=" + workoutNote + ", caloriesBurnPerMin=" + caloriesBurnPerMin + "]";
	}
	

}
