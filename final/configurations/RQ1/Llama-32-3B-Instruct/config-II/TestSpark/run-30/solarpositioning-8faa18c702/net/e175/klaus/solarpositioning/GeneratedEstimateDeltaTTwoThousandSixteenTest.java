package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedEstimateDeltaTTwoThousandSixteenTest {

    @Test
    public void estimateDeltaTTwoThousandSixteenTest() {
        LocalDate forDate = LocalDate.of(2016, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertTrue(result >= -2400 && result <= 700);
    }

}