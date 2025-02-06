package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_SameDate {

    @Test
    public void estimate_SameDate() {
        LocalDate date = LocalDate.of(2023, 3, 20);

        double result1 = DeltaT.estimate(date);
        double result2 = DeltaT.estimate(date);

        assertEquals(result1, result2, 0.00001); // approximate value
    }

}