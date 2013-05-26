package com.conventnunnery.plugins.conventlib.utils;

import com.conventnunnery.plugins.conventlib.containers.DecimalRangeContainer;
import com.conventnunnery.plugins.conventlib.containers.WholeRangeContainer;

import java.util.Random;

public final class RandomUtils {

    private static final Random random = new Random();

    private RandomUtils() {

    }

    /**
     * Returns a value between value1 and value2 that can include value1, but not value2
     *
     * @param value1 First value
     * @param value2 Second value
     * @return a value between value1 and value2 that can include value1, but not value2
     */
    public static long randomRangeWholeExclusive(long value1, long value2) {
        return Math.min(value1, value2) +
                (long) (random.nextDouble() * (Math.max(value1, value2) - Math.min(value1, value2)));
    }

    /**
     * Returns a value between value1 and value2 that can include value1 and value2
     *
     * @param value1 First value
     * @param value2 Second value
     * @return a value between value1 and value2 that can include value1 and value2
     */
    public static long randomRangeWholeInclusive(long value1, long value2) {
        long value = Math.min(value1, value2) +
                (long) (random.nextDouble() * (Math.max(value1, value2) - Math.min(value1, value2) + 1));
        return Math.min(value, Math.max(value1, value2));
    }

    /**
     * Returns a value based on a WholeRangeContainer, including its lower value but not the upper
     *
     * @param rangeContainer WholeRangeContainer to check against
     * @return a value based on a WholeRangeContainer, including its lower value but not the upper
     */
    public static long randomRangeWholeContainerExclusive(WholeRangeContainer rangeContainer) {
        return rangeContainer.getLower() + (long) (random.nextDouble() * rangeContainer.getRange());
    }

    /**
     * Returns a value based on a WholeRangeContainer, including both its lower and upper values
     *
     * @param rangeContainer WholeRangeContainer to check against
     * @return a value based on a WholeRangeContainer, including both its lower and upper values
     */
    public static long randomRangeWholeContainerInclusive(WholeRangeContainer rangeContainer) {
        long value = rangeContainer.getLower() + (long) (random.nextDouble() * (rangeContainer.getRange() + 1));
        return Math.min(value, rangeContainer.getHigher());
    }

    /**
     * Returns a value between value1 and value2 that can include value1, but not value2
     *
     * @param value1 First value
     * @param value2 Second value
     * @return a value between value1 and value2 that can include value1, but not value2
     */
    public static double randomRangeDecimalExclusive(double value1, double value2) {
        return Math.min(value1, value2) + random.nextDouble() * (Math.max(value1, value2) - Math.min(value1, value2));
    }

    /**
     * Returns a value between value1 and value2 that can include value1 and value2
     *
     * @param value1 First value
     * @param value2 Second value
     * @return a value between value1 and value2 that can include value1 and value2
     */
    public static double randomRangeDecimalInclusive(double value1, double value2) {
        double value = Math.min(value1, value2) + random.nextDouble() * (Math.max(value1, value2) - Math
                .min(value1, value2) + 1);
        return Math.min(value, Math.max(value1, value2));
    }

    /**
     * Returns a value based on a DecimalRangeContainer, including both its lower value but not its upper
     *
     * @param rangeContainer DecimalRangeContainer to check against
     * @return a value based on a DecimalRangeContainer, including both its lower value but not its upper
     */
    public static double randomRangeDecimalContainerExclusive(DecimalRangeContainer rangeContainer) {
        double value = rangeContainer.getLower() + random.nextDouble() * rangeContainer.getRange();
        return Math.max(rangeContainer.getLower(), Math.min(value, rangeContainer.getHigher()));
    }

    /**
     * Returns a value based on a DecimalRangeContainer, including both its lower and upper values
     *
     * @param rangeContainer DecimalRangeContainer to check against
     * @return a value based on a DecimalRangeContainer, including both its lower and upper values
     */
    public static double randomRangeDecimalContainerInclusive(DecimalRangeContainer rangeContainer) {
        double value = rangeContainer.getLower() + random.nextDouble() * (rangeContainer.getRange() + 1);
        return Math.max(rangeContainer.getLower(), Math.min(value, rangeContainer.getHigher()));
    }
}
