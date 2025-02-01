package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetween500And1600Test {

    @Test
    public void estimateYearBetween500And1600Test() {
        LocalDate date = LocalDate.of(1500, 7, 1);
        assertTrue(DeltaT.estimate(date) == 705.81);
    }

}