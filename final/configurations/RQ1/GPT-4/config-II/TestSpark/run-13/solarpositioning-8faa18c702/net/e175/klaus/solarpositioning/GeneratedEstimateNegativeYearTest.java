package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateNegativeYearTest {

    private static final double EPSILON = 0.00001;

    @Test
    public void estimateNegativeYearTest() {
        LocalDate forDate = LocalDate.of(-600, 5, 6);
        double result = DeltaT.estimate(forDate);

        assertEquals(-3.2, result, EPSILON);
    }

}