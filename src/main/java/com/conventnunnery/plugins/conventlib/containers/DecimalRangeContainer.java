package com.conventnunnery.plugins.conventlib.containers;

public class DecimalRangeContainer {
    private final double value1;
    private final double value2;

    /**
     * Instantiates a new DecimalRangeContainer.
     * @param value1 First double value
     * @param value2 Second double value
     */
    public DecimalRangeContainer(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    /**
     * Returns the first value specified by the constructor.
     * @return first value specified by the constructor
     */
    public double getValue1() {
        return value1;
    }

    /**
     * Returns the second value specified by the constructor.
     * @return second value specified by the constructor
     */
    public double getValue2() {
        return value2;
    }

    /**
     * Returns the difference between the largest and the smallest values.
     * @return difference between the largest and smallest values
     */
    public double getRange() {
        return Math.abs(getHigher() - getLower());
    }

    /**
     * Return the smaller of the two specified values.
     * @return the smaller value
     */
    public double getLower() {
        return Math.min(value1, value2);
    }

    /**
     * The larger of the two specified values.
     * @return the larger value
     */
    public double getHigher() {
        return Math.max(value1, value2);
    }

}
