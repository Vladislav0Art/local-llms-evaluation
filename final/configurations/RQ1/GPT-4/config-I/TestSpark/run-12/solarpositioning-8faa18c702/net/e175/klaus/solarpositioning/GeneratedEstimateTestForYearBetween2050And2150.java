package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateTestForYearBetween2050And2150 {

    @Test
    public void estimateTestForYearBetween2050And2150() {
        LocalDate date = LocalDate.of(2100, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(67.95, deltaT, 0.01);
    }

}