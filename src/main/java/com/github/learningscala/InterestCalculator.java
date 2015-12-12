package com.github.learningscala;

/**
 * Created by archana on 12/12/15.
 */
public class InterestCalculator {

    /**
     *
     * @param principal loan amount
     * @param ratePeryear - rate of interest per year
     * @param years - no of years of loan
     * @return total interest paid over duration of loan
     */
    public Double calculateTotalSimpleInterest ( Double principal, Double  ratePeryear, int years) {
        return principal * ratePeryear * years;

    }

}
