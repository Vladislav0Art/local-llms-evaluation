package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateTestForYearBetween1920And1941 {

    @Test
    public void estimateTestForYearBetween1920And1941() {
        LocalDate date = LocalDate.of(1930, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(23.5262, deltaT, 0.01);
    }

}