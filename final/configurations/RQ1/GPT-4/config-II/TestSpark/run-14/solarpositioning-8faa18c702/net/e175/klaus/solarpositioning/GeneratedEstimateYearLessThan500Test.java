package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import org.junit.Test;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedEstimateYearLessThan500Test {

    @Test
    public void estimateYearLessThan500Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(400, 6, 15));
        assertTrue(deltaT > 0);
    }

}