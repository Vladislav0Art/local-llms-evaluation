package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBefore500BCTest {

    @Test
    public void estimateYearBefore500BCTest() {
        LocalDate forDate = LocalDate.of(-600, 6, 1);
        double deltaT = DeltaT.estimate(forDate);
        assertTrue(deltaT != 0);
    }

}