package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearLessThan2150Test {

    private static final double EPSILON = 0.00001;

    @Test
    public void estimateYearLessThan2150Test() {
        LocalDate date = LocalDate.of(2100, 5, 6);
        double deltaT = DeltaT.estimate(date);

        assertEquals(121.8572, deltaT, EPSILON);
    }

}