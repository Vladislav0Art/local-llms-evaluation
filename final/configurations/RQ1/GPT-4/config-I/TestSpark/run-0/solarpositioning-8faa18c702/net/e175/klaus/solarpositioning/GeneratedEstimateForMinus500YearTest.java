package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateForMinus500YearTest {

    @Test
    public void estimateForMinus500YearTest() {
        LocalDate date = LocalDate.of(-500, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(-20.0, result, 0.00001);
    }

}