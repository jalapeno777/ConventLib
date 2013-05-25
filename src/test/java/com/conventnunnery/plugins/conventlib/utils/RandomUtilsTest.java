package com.conventnunnery.plugins.conventlib.utils;

import com.conventnunnery.plugins.conventlib.containers.DecimalRangeContainer;
import com.conventnunnery.plugins.conventlib.containers.WholeRangeContainer;
import junit.framework.Assert;
import org.junit.Test;

public class RandomUtilsTest {
    @Test
    public void testRandomRangeWholeExclusive() throws Exception {
        long value1 = 10;
        long value2 = 20;

        System.out.println(value1 + " | " + value2);

        long result = RandomUtils.randomRangeWholeExclusive(value1, value2);

        System.out.println("Exclusive: " + result);

        Assert.assertNotNull(result);
        Assert.assertTrue(result >= value1);
        Assert.assertTrue(result < value2);
    }

    @Test
    public void testRandomRangeWholeInclusive() throws Exception {
        long value1 = 10;
        long value2 = 20;

        System.out.println(value1 + " | " + value2);

        long result = RandomUtils.randomRangeWholeInclusive(value1, value2);

        System.out.println("Inclusive: " + result);

        Assert.assertNotNull(result);
        Assert.assertTrue(result >= value1);
        Assert.assertTrue(result <= value2);
    }

    @Test
    public void testRandomRangeWholeContainerExclusive() throws Exception {
        WholeRangeContainer wholeRangeContainer = new WholeRangeContainer(10, 20);

        System.out.println(wholeRangeContainer.getLower() + " | " + wholeRangeContainer.getHigher());

        long result = RandomUtils.randomRangeWholeContainerExclusive(wholeRangeContainer);

        System.out.println("Exclusive: " + result);

        Assert.assertNotNull(wholeRangeContainer);
        Assert.assertNotNull(result);
        Assert.assertTrue(result >= wholeRangeContainer.getLower());
        Assert.assertTrue(result < wholeRangeContainer.getHigher());
    }

    @Test
    public void testRandomRangeWholeContainerInclusive() throws Exception {
        WholeRangeContainer wholeRangeContainer = new WholeRangeContainer(10, 20);

        System.out.println(wholeRangeContainer.getLower() + " | " + wholeRangeContainer.getHigher());

        long result = RandomUtils.randomRangeWholeContainerInclusive(wholeRangeContainer);

        System.out.println("Inclusive: " + result);

        Assert.assertNotNull(wholeRangeContainer);
        Assert.assertNotNull(result);
        Assert.assertTrue(result >= wholeRangeContainer.getLower());
        Assert.assertTrue(result <= wholeRangeContainer
                .getHigher());
    }

    @Test
    public void testRandomRangeDecimalExclusive() throws Exception {
        double value1 = 10.0;
        double value2 = 20.0;

        System.out.println(value1 + " | " + value2);

        double result = RandomUtils.randomRangeDecimalExclusive(value1, value2);

        System.out.println("Exclusive: " + result);

        Assert.assertNotNull(result);
        Assert.assertTrue(result >= value1);
        Assert.assertTrue(result < value2);
    }

    @Test
    public void testRandomRangeDecimalInclusive() throws Exception {
        double value1 = 10.0;
        double value2 = 20.0;

        System.out.println(value1 + " | " + value2);

        double result = RandomUtils.randomRangeDecimalInclusive(value1, value2);

        System.out.println("Inclusive: " + result);

        Assert.assertNotNull(result);
        Assert.assertNotNull(value1);
        Assert.assertNotNull(value2);
        Assert.assertTrue(result >= value1);
        Assert.assertTrue(result <= value2);
    }

    @Test
    public void testRandomRangeDecimalContainerExclusive() throws Exception {
        DecimalRangeContainer decimalRangeContainer = new DecimalRangeContainer(10.0, 20.0);

        System.out.println(decimalRangeContainer.getLower() + " | " + decimalRangeContainer.getHigher());

        double result = RandomUtils.randomRangeDecimalContainerExclusive(decimalRangeContainer);

        System.out.println("Inclusive: " + result);

        Assert.assertNotNull(decimalRangeContainer);
        Assert.assertNotNull(result);
        Assert.assertTrue(result >= decimalRangeContainer.getLower());
        Assert.assertTrue(result < decimalRangeContainer.getHigher());
    }

    @Test
    public void testRandomRangeDecimalContainerInclusive() throws Exception {
        DecimalRangeContainer decimalRangeContainer = new DecimalRangeContainer(10.0, 20.0);

        System.out.println(decimalRangeContainer.getLower() + " | " + decimalRangeContainer.getHigher());

        double result = RandomUtils.randomRangeDecimalContainerInclusive(decimalRangeContainer);

        System.out.println("Inclusive: " + result);

        Assert.assertNotNull(decimalRangeContainer);
        Assert.assertNotNull(result);
        Assert.assertTrue(result >= decimalRangeContainer.getLower());
        Assert.assertTrue(result < decimalRangeContainer.getHigher());
    }
}
