package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedEstimateYearLessThanMinus500Test {

    @Test
    public void estimateYearLessThanMinus500Test() {
        LocalDate date = LocalDate.of(-1000, 6, 24);
        double result = DeltaT.estimate(date);
        assertTrue(result <= -20);
    }

}