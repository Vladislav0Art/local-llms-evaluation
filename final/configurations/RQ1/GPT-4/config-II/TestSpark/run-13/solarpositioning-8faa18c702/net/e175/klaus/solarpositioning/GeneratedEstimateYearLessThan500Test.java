package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearLessThan500Test {

    private static final double EPSILON = 0.00001;

    @Test
    public void estimateYearLessThan500Test() {
        LocalDate forDate = LocalDate.of(400, 5, 6);
        double result = DeltaT.estimate(forDate);

        assertEquals(10546.179893493652, result, EPSILON);
    }

}