package studentinfo;

import java.util.ArrayList;
import java.util.*;

public class CourseSession {
	private String department;
	private String number;
	private int numberOfStudents = 0;
	private ArrayList<Student> students = new ArrayList<Student>();
	private Date startDate;
	
	CourseSession(String department, String number) {
		this.department = department;
		this.number = number;
	}
	
	CourseSession(String department, String number, Date startDate) {
		this.department = department;
		this.number = number;
		this.startDate = startDate;
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

	public void enroll(Student student) {
		numberOfStudents = numberOfStudents + 1;
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
		Date endDate = calendar.getTime();
		return endDate;
	}

	public Date getStartDate() {
		return startDate;
	}
}
