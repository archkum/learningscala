package com.github.learningscala;

/**
 * Created by archana on 12/12/15.
 */
public class TaxCalculator {
    public static final double INC_21450 = 21450.0;
    public static final double RATE_015 = 0.15;
    private static final double RATE_028 = 0.28;
    private static final double RATE_031 = 0.31;
    public static final int INC_51900 = 51900;
    public static final double INC_35800 = 35800.0;
    private static final double INC_86500 = 86500.0;

    //TODO  Extract the 2 params to a new class. Use IntelliJ's refactoring tools
    public double calculateTax(boolean single, double income) {
        double tax = 0.0;
        if (single) {
            if (income <= INC_21450) {
                tax = income * RATE_015;
            } else if (income <= INC_51900) {
                tax = income * RATE_028;
            } else if (income > INC_51900) {
                tax = income * RATE_031;
            }
        } else
        //if ( not single)
        {
            if (income <= INC_35800) {
                tax = income * RATE_015;
            } else if (income <= INC_86500) {
                tax = income * RATE_028;
            } else if (income > INC_86500) {
                tax = income * RATE_031;
            }
        }

        return tax;
    }
}
