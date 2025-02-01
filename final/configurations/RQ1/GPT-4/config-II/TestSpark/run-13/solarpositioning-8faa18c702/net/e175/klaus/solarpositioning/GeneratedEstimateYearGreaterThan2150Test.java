package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearGreaterThan2150Test {

    private static final double EPSILON = 0.00001;

    @Test
    public void estimateYearGreaterThan2150Test() {
        LocalDate date = LocalDate.of(2200, 5, 6);
        double deltaT = DeltaT.estimate(date);

        assertEquals(209.60000000000002, deltaT, EPSILON);
    }

}