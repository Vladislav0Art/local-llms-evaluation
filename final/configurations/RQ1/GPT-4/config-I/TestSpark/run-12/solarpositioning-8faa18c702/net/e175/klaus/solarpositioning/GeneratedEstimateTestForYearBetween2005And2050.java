package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateTestForYearBetween2005And2050 {

    @Test
    public void estimateTestForYearBetween2005And2050() {
        LocalDate date = LocalDate.of(2030, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(68.72666, deltaT, 0.01);
    }

}