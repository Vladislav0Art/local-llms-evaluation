package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateTestForYearBetween1961And1986 {

    @Test
    public void estimateTestForYearBetween1961And1986() {
        LocalDate date = LocalDate.of(1975, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(45.6647, deltaT, 0.01);
    }

}