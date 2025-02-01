package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import org.junit.Test;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedEstimateYearLessThan1961Test {

    @Test
    public void estimateYearLessThan1961Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1960, 6, 15));
        assertTrue(deltaT > 0);
    }

}