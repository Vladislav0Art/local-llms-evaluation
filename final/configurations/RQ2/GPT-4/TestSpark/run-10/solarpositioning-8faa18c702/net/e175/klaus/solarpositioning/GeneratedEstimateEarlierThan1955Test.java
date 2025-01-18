package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedEstimateEarlierThan1955Test {

    @Test
    public void estimateEarlierThan1955Test() {
        LocalDate date = LocalDate.of(1940, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(24.45, result, 0.001);
    }

}