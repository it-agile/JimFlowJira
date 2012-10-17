package de.itagile.jimflowjira;

import static org.junit.Assert.assertEquals;

import java.sql.Timestamp;

import org.junit.Test;

public class JimFlowFieldTest {

	@Test
	public void test() {
		Timestamp created = new Timestamp(2000-1900, 10, 5, 1, 2, 3, 4);
		String createdString = new JimFlowField(null, null).formatDate(created);
		assertEquals("05.11.2000", createdString);
	}

}
