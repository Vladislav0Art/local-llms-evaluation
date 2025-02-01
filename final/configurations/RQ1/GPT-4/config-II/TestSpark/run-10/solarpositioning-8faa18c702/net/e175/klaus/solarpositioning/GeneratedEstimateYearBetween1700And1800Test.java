package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetween1700And1800Test {

    @Test
    public void estimateYearBetween1700And1800Test() {
        LocalDate date = LocalDate.of(1750, 7, 1);
        assertTrue(DeltaT.estimate(date) == 13.149692727840421);
    }

}