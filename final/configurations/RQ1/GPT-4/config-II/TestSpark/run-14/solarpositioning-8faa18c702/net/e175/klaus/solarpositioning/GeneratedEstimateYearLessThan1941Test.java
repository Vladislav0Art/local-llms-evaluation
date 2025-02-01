package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import org.junit.Test;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedEstimateYearLessThan1941Test {

    @Test
    public void estimateYearLessThan1941Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1940, 6, 15));
        assertTrue(deltaT > 0);
    }

}