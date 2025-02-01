package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearLessThan2050Test {

    private static final double EPSILON = 0.00001;

    @Test
    public void estimateYearLessThan2050Test() {
        LocalDate date = LocalDate.of(2030, 5, 6);
        double deltaT = DeltaT.estimate(date);

        assertEquals(74.808455, deltaT, EPSILON);
    }

}