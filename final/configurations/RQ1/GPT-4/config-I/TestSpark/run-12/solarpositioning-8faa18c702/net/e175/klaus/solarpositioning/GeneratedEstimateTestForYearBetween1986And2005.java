package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateTestForYearBetween1986And2005 {

    @Test
    public void estimateTestForYearBetween1986And2005() {
        LocalDate date = LocalDate.of(1995, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(62.632467367, deltaT, 0.01);
    }

}