package com.mabuza;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class JenkinsCalcTest {

	@Test
	public void testAdd() {
		JenkinsCalc calc = new JenkinsCalc();
		assertEquals(10, calc.addNumbers(5, 5));
	}
	
	@Test
	public void testSubtract() {
		JenkinsCalc calc = new JenkinsCalc();
		assertEquals(5, calc.subtractNumbers(10, 5));
	}

}
