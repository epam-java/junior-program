package com.epam.jmp.patterns.iterator;

public class Range {

    private int from, to;

    private Range(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public static Range range(int from, int to) {
        return new Range(from, to);
    }
}
