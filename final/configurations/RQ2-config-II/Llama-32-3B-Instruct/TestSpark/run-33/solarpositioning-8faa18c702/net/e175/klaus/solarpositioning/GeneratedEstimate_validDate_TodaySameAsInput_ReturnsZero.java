package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_validDate_TodaySameAsInput_ReturnsZero {

    @Test
    public void estimate_validDate_TodaySameAsInput_ReturnsZero() {
        LocalDate date = LocalDate.now();
        double deltaT = DeltaT.estimate(date);
        assertTrue(deltaT == 0);
    }

}