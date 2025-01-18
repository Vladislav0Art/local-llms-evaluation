package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedEstimateEarlierThan1600Test {

    @Test
    public void estimateEarlierThan1600Test() {
        LocalDate date = LocalDate.of(1599, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(8.75, result, 0.001);
    }

}