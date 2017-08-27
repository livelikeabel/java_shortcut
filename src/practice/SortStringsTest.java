package practice;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SortStringsTest {

	@Test
	public void testSortStringsInPlace() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Heller");
		list.add("Kafka");
		list.add("Camus");
		list.add("Boyle");
		java.util.Collections.sort(list);
		assertEquals("Boyle", list.get(0));
		assertEquals("Camus", list.get(1));
		assertEquals("Heller", list.get(2));
		assertEquals("Kafka", list.get(3));
	}
	
	@Test
	public void testSortStringsInNewList() throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Heller");
		list.add("Kafka");
		list.add("Camus");
		list.add("Boyle");
		ArrayList<String> sortedList = new ArrayList<String>(list);
		java.util.Collections.sort(sortedList);
		assertEquals("Boyle", sortedList.get(0));
		assertEquals("Camus", sortedList.get(1));
		assertEquals("Heller", sortedList.get(2));
		assertEquals("Kafka", sortedList.get(3));
		
//		assertEquals("Heller", sortedList.get(0));
//		assertEquals("Kafka", sortedList.get(1));
//		assertEquals("Camus", sortedList.get(2));
//		assertEquals("Boyle", sortedList.get(3));
	}

}
