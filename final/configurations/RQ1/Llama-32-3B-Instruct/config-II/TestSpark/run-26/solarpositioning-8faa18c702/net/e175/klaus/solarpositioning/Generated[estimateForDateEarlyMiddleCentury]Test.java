package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class Generated[estimateForDateEarlyMiddleCentury]

Test {

    @Test
    public void [estimateForDateEarlyMiddleCentury]Test() {
        LocalDate date = LocalDate.of(1950, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(date);
        assertEquals(-20, result, 0.001);
    }

}