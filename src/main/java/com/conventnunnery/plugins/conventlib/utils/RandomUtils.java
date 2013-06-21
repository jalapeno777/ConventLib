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
        long max = Math.max(value1, value2);
        long min = Math.min(value1, value2);
        long value = min + (long) (random.nextDouble() * (max - min));
        // return Math.min(Math.max(value, min), max - 1);
        if (value < min) {
            return min;
        }
        if (value >= max) {
            return max - 1;
        }
        return value;
    }

    /**
     * Returns a value between value1 and value2 that can include value1 and value2
     *
     * @param value1 First value
     * @param value2 Second value
     * @return a value between value1 and value2 that can include value1 and value2
     */
    public static long randomRangeWholeInclusive(long value1, long value2) {
        long max = Math.max(value1, value2);
        long min = Math.min(value1, value2);
        long value = min + (long) (random.nextDouble() * (max - min + 1));
        // return Math.min(Math.max(value, min), max);
        if (value < min) {
            return min;
        }
        if (value > max) {
            return max;
        }
        return value;
    }

    /**
     * Returns a value based on a WholeRangeContainer, including its lower value but not the upper
     *
     * @param rangeContainer WholeRangeContainer to check against
     * @return a value based on a WholeRangeContainer, including its lower value but not the upper
     */
    public static long randomRangeWholeContainerExclusive(WholeRangeContainer rangeContainer) {
        long min = rangeContainer.getLower();
        long max = rangeContainer.getHigher();
        long value = min + (long) (random.nextDouble() * rangeContainer.getRange());
        // return Math.min(Math.max(value, min), max - 1);
        if (value < min) {
            return min;
        }
        if (value >= max) {
            return max - 1;
        }
        return value;
    }

    /**
     * Returns a value based on a WholeRangeContainer, including both its lower and upper values
     *
     * @param rangeContainer WholeRangeContainer to check against
     * @return a value based on a WholeRangeContainer, including both its lower and upper values
     */
    public static long randomRangeWholeContainerInclusive(WholeRangeContainer rangeContainer) {
        long min = rangeContainer.getLower();
        long max = rangeContainer.getHigher();
        long value = min + (long) (random.nextDouble() * (rangeContainer.getRange() + 1));
        // return Math.min(Math.max(value, min), max);
        if (value < min) {
            return min;
        }
        if (value > max) {
            return max;
        }
        return value;
    }

    /**
     * Returns a value between value1 and value2 that can include value1, but not value2
     *
     * @param value1 First value
     * @param value2 Second value
     * @return a value between value1 and value2 that can include value1, but not value2
     */
    public static double randomRangeDecimalExclusive(double value1, double value2) {
        double min = Math.min(value1, value2);
        double max = Math.max(value1, value2);
        double value = min + random.nextDouble() * (max - min);
        // return Math.min(Math.max(value, min), max - 1);
        if (value < min) {
            return min;
        }
        if (value >= max) {
            return max - 1;
        }
        return value;
    }

    /**
     * Returns a value between value1 and value2 that can include value1 and value2
     *
     * @param value1 First value
     * @param value2 Second value
     * @return a value between value1 and value2 that can include value1 and value2
     */
    public static double randomRangeDecimalInclusive(double value1, double value2) {
        double min = Math.min(value1, value2);
        double max = Math.max(value1, value2);
        double value = min + random.nextDouble() * (max - min + 1.0);
        if (value < min) {
            return min;
        }
        if (value > max) {
            return max;
        }
        return value;
    }

    /**
     * Returns a value based on a DecimalRangeContainer, including both its lower value but not its upper
     *
     * @param rangeContainer DecimalRangeContainer to check against
     * @return a value based on a DecimalRangeContainer, including both its lower value but not its upper
     */
    public static double randomRangeDecimalContainerExclusive(DecimalRangeContainer rangeContainer) {
        double min = rangeContainer.getLower();
        double max = rangeContainer.getHigher();
        double value = min + random.nextDouble() * rangeContainer.getRange();
        if (value < min) {
            return min;
        }
        if (value >= max) {
            return max - 1;
        }
        return value;
    }

    /**
     * Returns a value based on a DecimalRangeContainer, including both its lower and upper values
     *
     * @param rangeContainer DecimalRangeContainer to check against
     * @return a value based on a DecimalRangeContainer, including both its lower and upper values
     */
    public static double randomRangeDecimalContainerInclusive(DecimalRangeContainer rangeContainer) {
        double min = rangeContainer.getLower();
        double max = rangeContainer.getHigher();
        double value = min + random.nextDouble() * (rangeContainer.getRange() + 1.0);
        if (value < min) {
            return min;
        }
        if (value > max) {
            return max;
        }
        return value;
    }
}
