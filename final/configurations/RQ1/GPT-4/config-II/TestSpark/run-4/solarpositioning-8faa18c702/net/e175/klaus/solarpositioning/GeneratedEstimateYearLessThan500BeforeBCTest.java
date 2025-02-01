package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateYearLessThan500BeforeBCTest {

    @Test
    public void estimateYearLessThan500BeforeBCTest() {
        LocalDate date = LocalDate.of(-600, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(0.0, deltaT, 0.01);
    }

}