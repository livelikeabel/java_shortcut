package sis.studentinfo;

import java.util.*;

public class Student {
	private String name;
	private int credits;
	private String state = "";
	private ArrayList<String> grades = new ArrayList<String>();
	static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
	static final String IN_STATE = "CO";

	public Student(String name) {
		this.name = name;
		credits = 0;
	}

	public String getName() {

		return this.name;
	}

	boolean isFullTime() {
		return credits >= CREDITS_REQUIRED_FOR_FULL_TIME;
	}

	int getCredits() {
		return credits;
	}

	void addCredits(int credits) {
		this.credits += credits;
	}

	void setState(String state) {
		this.state = state;
	}

	boolean isInState() {
		return state.equals(Student.IN_STATE);
	}
	
	void addGrade(String grade) {
		grades.add(grade);
	}
	
	double getGpa() {
	  if (grades.isEmpty())
		return 0.0;
	  double total = 0.0;
	  for (String grade: grades) 
		  total += gradePointsFor(grade);
	  return total / grades.size();
	}
	
	int gradePointsFor(String grade) {
		if (grade.equals("A")) return 4;
		if (grade.equals("B")) return 3;
		if (grade.equals("C")) return 2;
		if (grade.equals("D")) return 1;
		return 0;
	}
	
	
	
	
	
	
	
}
