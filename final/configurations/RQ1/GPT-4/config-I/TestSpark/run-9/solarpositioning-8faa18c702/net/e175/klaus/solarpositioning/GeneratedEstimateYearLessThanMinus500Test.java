package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateYearLessThanMinus500Test {

    @Test
    public void estimateYearLessThanMinus500Test() {
        LocalDate date = LocalDate.of(-600, 5, 1);
        assertEquals(320.0, DeltaT.estimate(date), 0);
    }

}