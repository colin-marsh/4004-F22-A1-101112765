package project;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * TestSuite is a test suite fore all tests. All testcase files should be inside the Suite
 *
 * @author Sebastian Gadzinski
 * @author Tarnish
 */

@RunWith(Suite.class)
@Suite.SuiteClasses( {DieTest.class, ScoreBoardTest.class} )
public class TestSuite {

}