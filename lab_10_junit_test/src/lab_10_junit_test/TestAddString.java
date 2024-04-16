package lab_10_junit_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAddString {

	@Test
	void test() {
		lab_10_junit_testFunction junitstring =new lab_10_junit_testFunction();
		string result  = junitstring.concatenateStrings(Hello,Bro);
		assertEquals("HelloBro",result);
	}

}
