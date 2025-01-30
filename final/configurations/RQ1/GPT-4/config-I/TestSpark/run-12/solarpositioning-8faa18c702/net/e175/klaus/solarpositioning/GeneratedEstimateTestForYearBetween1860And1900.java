package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateTestForYearBetween1860And1900 {

    @Test
    public void estimateTestForYearBetween1860And1900() {
        LocalDate date = LocalDate.of(1890, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(9.8630, deltaT, 0.01);
    }

}