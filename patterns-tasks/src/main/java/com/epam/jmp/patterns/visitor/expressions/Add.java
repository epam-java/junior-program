package com.epam.jmp.patterns.visitor.expressions;

import com.epam.jmp.patterns.visitor.Expr;

/**
 * Sum of two expression (Operator '+').
 */
public class Add implements Expr {

    private final Expr left;
    private final Expr right;

    public static Add add(Expr left, Expr right) {
        return new Add(left, right);
    }

    private Add(Expr left, Expr right) {
        this.left = left;
        this.right = right;
    }

    public Expr getLeft() {
        return left;
    }

    public Expr getRight() {
        return right;
    }

    @Override
    public String asString() {
        return "(" + left.asString() + " + " + right.asString() + ")";
    }

    @Override
    public String toString() {
        return asString();
    }
}
