package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearLessThan1961Test {

    private static final double EPSILON = 0.00001;

    @Test
    public void estimateYearLessThan1961Test() {
        LocalDate date = LocalDate.of(1950, 5, 6);
        double deltaT = DeltaT.estimate(date);

        assertEquals(27.830000000000002, deltaT, EPSILON);
    }

}