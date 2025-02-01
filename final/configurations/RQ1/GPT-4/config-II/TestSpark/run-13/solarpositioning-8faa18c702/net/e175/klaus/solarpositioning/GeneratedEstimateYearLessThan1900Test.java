package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearLessThan1900Test {

    private static final double EPSILON = 0.00001;

    @Test
    public void estimateYearLessThan1900Test() {
        LocalDate date = LocalDate.of(1880, 5, 6);
        double deltaT = DeltaT.estimate(date);

        assertEquals(6.235510193919999, deltaT, EPSILON);
    }

}