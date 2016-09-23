package test.tools;

import java.util.Random;

/**
 * Dice class for Test001.
 * 
 * @author Angel Mate
 *
 */

public class Dice {

	/**
	 * Arbitrary value to be added to the result of rolls.
	 */

	private static final int ARBITRARY_VALUE = 1;

	/**
	 * Rolls a dice. An arbitrary value is added to the result, to get values
	 * between 1 and the number of sides, both inclusive.
	 * 
	 * @param size
	 *            The number of sides the dice shall have.
	 * @return The result of rolling the dice.
	 */

	public static int roll(int size) {
		Random randomizer = new Random();
		return randomizer.nextInt(20) + ARBITRARY_VALUE;
	}
}
