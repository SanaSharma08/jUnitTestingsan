package jUnitTestPackage;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ testaddNumbers.class, testaddStrings.class })
public class AllTests {

}
