package de.itagile.jimflowjira;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class JimFlowFieldTest {

	@Test
	public void test() {
		Timestamp created = new Timestamp(2000-1900, 10, 5, 1, 2, 3, 4);
		String createdString = new SimpleDateFormat("yyyy.MM.dd").format(created);
		assertEquals("2000.11.05", createdString);
	}

}
