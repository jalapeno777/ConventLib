package com.conventnunnery.plugins.conventlib.containers;

public class RangeContainer {
    private final long value1;
    private final long value2;

    public RangeContainer(long value1, long value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public long getValue1() {
        return value1;
    }

    public long getValue2() {
        return value2;
    }

    public long getRange() {
        return Math.abs(getHigher() - getLower());
    }

    public long getLower() {
        return Math.min(value1, value2);
    }

    public long getHigher() {
        return Math.max(value1, value2);
    }

}
