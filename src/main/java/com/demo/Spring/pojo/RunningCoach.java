package com.demo.Spring.pojo;

public class RunningCoach implements Coach{
	
	@Override
	public String getWorkoutDetails() {
		return "Run for 1 hour daily";
	}

}
