package sis.report;

import org.junit.Test;

import junit.framework.TestCase;
import sis.studentinfo.CourseSession;
import sis.studentinfo.DateUtil;
import sis.studentinfo.Student;
import static sis.report.ReportConstant.NEWLINE;
import static sis.report.ReportConstant.ROSTER_REPORT_HEADER;
import static sis.report.ReportConstant.ROSTER_REPORT_FOOTER;

public class RosterReporterTest extends TestCase {

	@Test
	public void testRosterReport() {
		CourseSession session =
			new CourseSession("ENGL", "101",
				DateUtil.createDate(2003, 1, 6));
		
		session.enroll(new Student("A"));
		session.enroll(new Student("B"));
		
		String rosterReport = new RosterReporter(session).getReport();
		assertEquals(
				ROSTER_REPORT_HEADER +
				"A" + NEWLINE + 
				"B" + NEWLINE +
				ROSTER_REPORT_FOOTER + "2" +
				NEWLINE, rosterReport);
	}

}
