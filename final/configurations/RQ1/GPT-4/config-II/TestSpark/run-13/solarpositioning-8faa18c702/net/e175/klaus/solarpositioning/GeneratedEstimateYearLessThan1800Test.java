package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearLessThan1800Test {

    private static final double EPSILON = 0.00001;

    @Test
    public void estimateYearLessThan1800Test() {
        LocalDate date = LocalDate.of(1750, 5, 6);
        double deltaT = DeltaT.estimate(date);

        assertEquals(13.214119, deltaT, EPSILON);
    }

}