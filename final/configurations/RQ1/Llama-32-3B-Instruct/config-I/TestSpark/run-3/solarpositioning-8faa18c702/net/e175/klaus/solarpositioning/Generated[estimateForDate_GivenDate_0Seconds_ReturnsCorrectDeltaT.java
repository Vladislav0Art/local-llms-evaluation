package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class Generated[

estimateForDate_GivenDate_0Seconds_ReturnsCorrectDeltaT {

    @Test
    public void [estimateForDate_GivenDate_0Seconds_ReturnsCorrectDeltaT() {
        LocalDate date = LocalDate.of(2022, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(0, deltaT, 0.00001);
    }

}