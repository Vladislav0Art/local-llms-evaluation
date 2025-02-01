package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import org.junit.Test;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;

public class GeneratedEstimateYearMoreThan2150Test {

    @Test
    public void estimateYearMoreThan2150Test() {
        double deltaT = DeltaT.estimate(LocalDate.of(2200, 6, 15));
        assertTrue(deltaT > 0);
    }

}