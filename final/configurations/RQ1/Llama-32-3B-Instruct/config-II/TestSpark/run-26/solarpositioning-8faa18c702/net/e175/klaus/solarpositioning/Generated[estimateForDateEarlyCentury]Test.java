package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class Generated[estimateForDateEarlyCentury]

Test {

    @Test
    public void [estimateForDateEarlyCentury]Test() {
        LocalDate date = LocalDate.of(1900, 1, 1);
        double result = net.e175.klaus.solarpositioning.DeltaT.estimate(date);
        assertEquals(-2.79, result, 0.001);
    }

}