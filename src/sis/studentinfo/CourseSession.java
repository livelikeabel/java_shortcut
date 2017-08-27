package sis.studentinfo;

import java.util.*;

public class CourseSession implements Comparable<CourseSession> {
	private String department;
	private String number;
	private ArrayList<Student> students = new ArrayList<Student>();
	private Date startDate;
	private static int count;
	private int numberOfCredits;
	
	private CourseSession(String department, String number, Date startDate) {
		this.department = department;
		this.number = number;
		this.startDate = startDate;
	}
	
	public static CourseSession create(
			String department, 
			String number, 
			Date startDate) {
		incrementCount();
		return new CourseSession(department, number, startDate);
	}

	public String getDepartment() {
		return department;
	}

	public String getNumber() {
		return number;
	}

	public int getNumberOfStudents() {
		return students.size();
	}
	
	void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}

	public void enroll(Student student) {
		student.addCredits(numberOfCredits);
		students.add(student);
	}

	public ArrayList<Student> getAllStudents() {
		return students;
	}

	public Student get(int index) {
		return students.get(index);
	}

	public Date getEndDate() {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(startDate);
		int numberOfDays = 16 * 7 - 3;
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		return calendar.getTime();
	}

	public Date getStartDate() {
		return startDate;
	}
	
	static void resetCount() {
		count = 0;
	}

	static int getCount() {
		return count;
	}
	
	private static void incrementCount() {
		count = count + 1;
	}
	
	public int compareTo(CourseSession that) {
		return this.getDepartment().compareTo(that.getDepartment());
	}

}
	