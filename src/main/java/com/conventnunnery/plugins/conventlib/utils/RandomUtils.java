package com.conventnunnery.plugins.conventlib.utils;

import com.conventnunnery.plugins.conventlib.containers.DecimalRangeContainer;
import com.conventnunnery.plugins.conventlib.containers.WholeRangeContainer;

import java.util.Random;

public final class RandomUtils {

    private static final Random random = new Random();

    protected RandomUtils() {
    }

    public static long randomRangeWhole(long value1, long value2) {
        return Math.min(value1, value2) +
                (long) (random.nextDouble() * (Math.max(value1, value2) - Math.min(value1, value2)));
    }

    public static long randomRangeWholeContainer(WholeRangeContainer rangeContainer) {
        return rangeContainer.getLower() + (long) (random.nextDouble() * rangeContainer.getRange());
    }

    public static double randomRangeDecimal(double value1, double value2) {
        return Math.min(value1, value2) + random.nextDouble() * (Math.max(value1, value2) - Math.min(value1, value2));
    }

    public static double randomRangeDecimalContainer(DecimalRangeContainer rangeContainer) {
        return rangeContainer.getLower() + random.nextDouble() * rangeContainer.getRange();
    }
}
