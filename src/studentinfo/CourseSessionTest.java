package studentinfo;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class CourseSessionTest {
	private CourseSession session;
	private Date startDate;

	@Before
	public void setUp() {
		int year = 103;
		int month = 0;
		int date = 6;
		startDate = new Date(year, month, date);
		session = new CourseSession("ENGL", "101", startDate);
	}

	@Test
	public void testCreate() {
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(0, session.getNumberOfStudents());
		assertEquals(startDate, session.getStartDate());
	}

	@Test
	public void testEnrollStudents() throws Exception {
		Student student1 = new Student("Cain DiVoe");
		session.enroll(student1);
		assertEquals(1, session.getNumberOfStudents());
		assertEquals(student1, session.get(0));

		Student student2 = new Student("Coralee DeVaughn");
		session.enroll(student2);
		assertEquals(2, session.getNumberOfStudents());
		assertEquals(student1, session.get(0));
		assertEquals(student2, session.get(1));
	}

	@Test
	public void testCourseDates() throws Exception {
		int year = 103;
		int month = 3;
		int date = 25;
		Date sixteenWeeksOut = new Date(year, month, date);
		assertEquals(sixteenWeeksOut, session.getEndDate());
	}

}