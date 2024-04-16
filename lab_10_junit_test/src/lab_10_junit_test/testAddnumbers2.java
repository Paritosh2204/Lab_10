package lab_10_junit_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddnumbers2 {

	@Test
	void test() {
		lab_10_junit_testFunction junitstring =new lab_10_junit_testFunction();
	    int result  = junitstring.addIntegers(100, 220);
		assertEquals(320,result);
	}

}
