package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import org.junit.Test;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedEstimateYearLessThanNegative500Test {

    @Test
    public void estimateYearLessThanNegative500Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(-600, 6, 15));
        assertTrue(deltaT < 0);
    }

}