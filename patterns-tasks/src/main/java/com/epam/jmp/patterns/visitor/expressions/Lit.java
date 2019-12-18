package com.epam.jmp.patterns.visitor.expressions;

import com.epam.jmp.patterns.visitor.Expr;

/**
 * Literal
 */
public class Lit implements Expr {

    private final int value;

    public static Lit lit(int value) {
        return new Lit(value);
    }

    private Lit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String asString() {
        return "" + value;
    }

    @Override
    public String toString() {
        return asString();
    }
}
