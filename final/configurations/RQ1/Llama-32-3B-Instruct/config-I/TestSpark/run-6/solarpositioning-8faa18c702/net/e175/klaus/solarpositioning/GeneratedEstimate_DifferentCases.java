package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_DifferentCases {

    @Test
    public void estimate_DifferentCases() {
        LocalDate forDate1 = LocalDate.of(2000, 1, 1);
        LocalDate forDate2 = LocalDate.of(2022, 12, 31);

        double result1 = DeltaT.estimate(forDate1);
        double result2 = DeltaT.estimate(forDate2);

        assertTrue(result1 >= -15 && result1 <= 5);
        assertTrue(result2 >= -25 && result2 <= 5);
    }
}

}