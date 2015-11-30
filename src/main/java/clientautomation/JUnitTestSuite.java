package clientautomation;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestLoginScenarioWithInValidCredentials.class,
	TestLoginScenarioWithValidCredentials.class,
})

public class JUnitTestSuite {

}
