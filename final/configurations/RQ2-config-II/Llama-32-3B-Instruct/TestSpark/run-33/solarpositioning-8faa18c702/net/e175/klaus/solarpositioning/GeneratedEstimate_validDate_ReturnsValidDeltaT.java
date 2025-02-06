package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_validDate_ReturnsValidDeltaT {

    @Test
    public void estimate_validDate_ReturnsValidDeltaT() {
        LocalDate date = LocalDate.of(2023, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertTrue(deltaT > 0 && deltaT < 30);
    }

}