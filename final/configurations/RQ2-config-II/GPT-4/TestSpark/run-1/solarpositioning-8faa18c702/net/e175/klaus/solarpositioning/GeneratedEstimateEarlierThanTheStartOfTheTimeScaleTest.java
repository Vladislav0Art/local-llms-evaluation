package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateEarlierThanTheStartOfTheTimeScaleTest {

    @Test
    public void estimateEarlierThanTheStartOfTheTimeScaleTest() {
        LocalDate date = LocalDate.of(1601, 1, 1);
        assertTrue(Double.isNaN(DeltaT.estimate(date)));
    }

}