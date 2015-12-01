package clientautomation;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestLoginScenarioWithInValidCredentials.class,
	TestLoginScenarioWithValidCredentials.class,
	TestSearchScenarios.class,
	TestPlayingTrackScenario.class
})

public class JUnitTestSuite {

}
