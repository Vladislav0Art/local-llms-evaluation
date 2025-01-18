package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateSpecificDateTest {

    @Test
    public void estimateSpecificDateTest() {
        LocalDate date = LocalDate.of(2000, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(63.83, deltaT, 0.01);
    }

}