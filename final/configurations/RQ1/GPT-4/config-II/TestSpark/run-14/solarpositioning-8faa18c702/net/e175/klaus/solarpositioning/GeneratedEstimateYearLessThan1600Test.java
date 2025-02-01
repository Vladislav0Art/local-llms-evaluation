package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import org.junit.Test;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedEstimateYearLessThan1600Test {

    @Test
    public void estimateYearLessThan1600Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(1500, 6, 15));
        assertTrue(deltaT > 0);
    }

}