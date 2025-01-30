package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateTestForYearBetween1800And1860 {

    @Test
    public void estimateTestForYearBetween1800And1860() {
        LocalDate date = LocalDate.of(1850, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(14.8429, deltaT, 0.01);
    }

}