package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateTestForYearBetween1941And1961 {

    @Test
    public void estimateTestForYearBetween1941And1961() {
        LocalDate date = LocalDate.of(1950, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(30.7301, deltaT, 0.01);
    }

}