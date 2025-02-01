package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import org.junit.Test;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedEstimateYearLessThan2050Test {

    @Test
    public void estimateYearLessThan2050Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(2049, 6, 15));
        assertTrue(deltaT > 0);
    }

}