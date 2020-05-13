package com.demo.Spring.pojo;

public class BaseBallCoach implements Coach{
	
	@Override
	public String getWorkoutDetails() {
		return "Do batting for 2 hours";
	}

}
