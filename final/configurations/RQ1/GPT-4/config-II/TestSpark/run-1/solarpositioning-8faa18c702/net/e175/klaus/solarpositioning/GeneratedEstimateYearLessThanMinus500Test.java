package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearLessThanMinus500Test {

    @Test
    public void estimateYearLessThanMinus500Test() {
        LocalDate date = LocalDate.of(-501, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(3179.36, result, 0.005);
    }

}