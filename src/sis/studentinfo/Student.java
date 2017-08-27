package sis.studentinfo;

public class Student {
	private String name;
	private int credits;
	private String state = "";
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
}
