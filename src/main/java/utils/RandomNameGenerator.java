package utils;

import java.math.BigInteger;
import java.security.SecureRandom;

public class RandomNameGenerator {

	private SecureRandom random;

	public RandomNameGenerator() {
		random = new SecureRandom();
	}

	public String nextSessionId() {
		return new BigInteger(130, random).toString(32);
	}
}
