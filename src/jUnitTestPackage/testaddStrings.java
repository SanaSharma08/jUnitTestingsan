package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testaddStrings {

	@Test
	void test() {
		jUnitfunctions jstr= new jUnitfunctions();
		String res=jstr.addStrings("lab", "10");
		assertEquals ("lab10",res);
	}

}
