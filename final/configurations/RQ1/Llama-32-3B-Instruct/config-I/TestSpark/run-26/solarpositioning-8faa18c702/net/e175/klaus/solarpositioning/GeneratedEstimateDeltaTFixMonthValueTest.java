package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimateDeltaTFixMonthValueTest {

    @Test
    public void estimateDeltaTFixMonthValueTest() {
        LocalDate date = LocalDate.of(2023, 10, 1);
        double result = DeltaT.estimate(date);
        assertEquals(-20 + 32 * pow((date.getYear() - 1820) / 100, 2), result);
    }

}