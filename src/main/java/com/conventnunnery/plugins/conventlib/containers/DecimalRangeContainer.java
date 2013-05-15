package com.conventnunnery.plugins.conventlib.containers;

public class DecimalRangeContainer {
    private final double value1;
    private final double value2;

    public DecimalRangeContainer(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }

    public double getRange() {
        return Math.abs(getHigher() - getLower());
    }

    public double getLower() {
        return Math.min(value1, value2);
    }

    public double getHigher() {
        return Math.max(value1, value2);
    }

}
