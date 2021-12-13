package test;

import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import main.Calendar;

class TestCalendar {

	@ParameterizedTest
	@ValueSource(ints= {2000, 2004, 2008, 2016, 2020})
	public void Should_return_true(int year) {
		Calendar calendar = new Calendar(year);
		assertTrue(calendar.isLeapYear());
		
	}

	@ParameterizedTest
	@ValueSource(ints= {2001, 2002, 2003, 2005, 2006})
	public void Should_return_false(int year) {
		Calendar calendar = new Calendar(year);
		assertFalse(calendar.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints= {1900, 1901, 1902, 1903, 1904})
	public void Should_return_if_year_is_leap(int year) {
		Calendar calendar = new Calendar(year);
		GregorianCalendar gC = new GregorianCalendar();
		
		if (gC.isLeapYear(year)) {
			assertTrue(calendar.isLeapYear());
		}
		else {
			assertFalse(calendar.isLeapYear());
		}
		
	}
	
	//the first leap year was 1752, it makes no sense to check the years before 1752.	
	@ParameterizedTest
	@ValueSource(ints= {1400, 1500, 1900, 1901, 1902})
	public void boundary_test(int year) {
		 if (year < 1752) {
		        throw new IllegalArgumentException("the first Leap Year was 1752 A.D.");
		    }
	}
}
