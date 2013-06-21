package com.conventnunnery.libraries.containers;

public class WholeRangeContainer {
    private final long value1;
    private final long value2;

    /**
     * Instantiates a new WholeRangeContainer.
     *
     * @param value1 First long value
     * @param value2 Second long value
     */
    public WholeRangeContainer(long value1, long value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    /**
     * Returns the first long value in the constructor
     *
     * @return the first long value from the constructor
     */
    public long getValue1() {
        return value1;
    }

    /**
     * Returns the second long value in the constructor
     *
     * @return the second long value from the constructor
     */
    public long getValue2() {
        return value2;
    }

    /**
     * Returns the difference between the larger number and the smaller number.
     *
     * @return difference between larger and smaller
     */
    public long getRange() {
        return Math.abs(getHigher() - getLower());
    }

    /**
     * Returns the smaller of the two numbers.
     *
     * @return smaller of the two numbers
     */
    public long getLower() {
        return Math.min(value1, value2);
    }

    /**
     * Returns the larger of the two numbers.
     *
     * @return larger of the two numbers
     */
    public long getHigher() {
        return Math.max(value1, value2);
    }

}
