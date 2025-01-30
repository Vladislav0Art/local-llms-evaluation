package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateTestForYearBetween1600And1700 {

    @Test
    public void estimateTestForYearBetween1600And1700() {
        LocalDate date = LocalDate.of(1650, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(85.7728, deltaT, 0.01);
    }

}