package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearLessThan1700Test {

    private static final double EPSILON = 0.00001;

    @Test
    public void estimateYearLessThan1700Test() {
        LocalDate date = LocalDate.of(1650, 5, 6);
        double deltaT = DeltaT.estimate(date);

        assertEquals(85.37564310000001, deltaT, EPSILON);
    }

}