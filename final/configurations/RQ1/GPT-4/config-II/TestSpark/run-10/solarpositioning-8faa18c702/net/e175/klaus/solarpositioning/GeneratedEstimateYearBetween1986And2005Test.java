package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBetween1986And2005Test {

    @Test
    public void estimateYearBetween1986And2005Test() {
        LocalDate date = LocalDate.of(1995, 5, 1);
        assertTrue(DeltaT.estimate(date) == 64.40585882041666);
    }

}