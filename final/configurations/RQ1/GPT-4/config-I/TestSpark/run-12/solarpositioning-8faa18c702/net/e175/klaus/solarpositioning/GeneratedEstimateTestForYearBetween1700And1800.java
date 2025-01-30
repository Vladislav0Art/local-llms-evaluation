package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateTestForYearBetween1700And1800 {

    @Test
    public void estimateTestForYearBetween1700And1800() {
        LocalDate date = LocalDate.of(1750, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(10.3917, deltaT, 0.01);
    }

}