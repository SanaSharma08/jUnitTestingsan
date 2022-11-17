package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddNumbers {

	@Test
	void test() {
		jUnitfunctions juni= new jUnitfunctions();
		int result=juni.addNumbers(890, 33);
		assertEquals (923,result);
	}

}
