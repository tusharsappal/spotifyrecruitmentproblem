package utils;

import java.math.BigInteger;
import java.security.SecureRandom;

public class RandomNameGenerator {

	private SecureRandom random;

	public RandomNameGenerator() {
		random = new SecureRandom();
	}

	public String generateName(int numOfBits) {
		return new BigInteger(numOfBits, random).toString(32);
	}
}
