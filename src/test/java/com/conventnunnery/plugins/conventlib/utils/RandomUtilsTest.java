package com.conventnunnery.plugins.conventlib.utils;

import com.conventnunnery.plugins.conventlib.containers.DecimalRangeContainer;
import com.conventnunnery.plugins.conventlib.containers.WholeRangeContainer;
import junit.framework.Assert;
import org.junit.Test;

public class RandomUtilsTest {
    @Test
    public void testRandomRangeWhole() throws Exception {
        long value1 = 10;
        long value2 = 20;

        long result = RandomUtils.randomRangeWhole(value1, value2);

        Assert.assertTrue(result >= value1 && result <= value2);
    }

    @Test
    public void testRandomRangeWholeContainer() throws Exception {
        WholeRangeContainer rangeContainer = new WholeRangeContainer(10, 20);

        long result = RandomUtils.randomRangeWholeContainer(rangeContainer);

        Assert.assertTrue(result >= rangeContainer.getLower() && result <= rangeContainer.getHigher());
    }

    @Test
    public void testRandomRangeDecimal() throws Exception {
        double value1 = 10.0;
        double value2 = 20.0;

        double result = RandomUtils.randomRangeDecimal(value1, value2);

        Assert.assertTrue(result >= value1 && result <= value2);
    }

    @Test
    public void testRandomRangeDecimalContainer() throws Exception {
        DecimalRangeContainer rangeContainer = new DecimalRangeContainer(10.0, 20.0);

        double result = RandomUtils.randomRangeDecimalContainer(rangeContainer);

        Assert.assertTrue(result >= rangeContainer.getLower() && result <= rangeContainer.getHigher());
    }
}
