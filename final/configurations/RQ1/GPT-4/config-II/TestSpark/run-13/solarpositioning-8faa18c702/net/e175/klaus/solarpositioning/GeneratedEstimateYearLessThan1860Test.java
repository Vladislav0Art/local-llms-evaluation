package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearLessThan1860Test {

    private static final double EPSILON = 0.00001;

    @Test
    public void estimateYearLessThan1860Test() {
        LocalDate date = LocalDate.of(1850, 5, 6);
        double deltaT = DeltaT.estimate(date);

        assertEquals(8.062622062199999, deltaT, EPSILON);
    }

}