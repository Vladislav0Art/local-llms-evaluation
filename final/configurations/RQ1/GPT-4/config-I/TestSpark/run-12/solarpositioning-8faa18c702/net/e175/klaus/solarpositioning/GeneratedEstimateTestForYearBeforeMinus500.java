package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateTestForYearBeforeMinus500 {

    @Test
    public void estimateTestForYearBeforeMinus500() {
        LocalDate date = LocalDate.of(-600, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(481.96, deltaT, 0.01);
    }

}