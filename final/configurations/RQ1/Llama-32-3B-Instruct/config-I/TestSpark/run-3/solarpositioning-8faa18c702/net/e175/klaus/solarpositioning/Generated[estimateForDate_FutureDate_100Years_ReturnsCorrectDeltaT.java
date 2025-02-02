package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class Generated[

estimateForDate_FutureDate_100Years_ReturnsCorrectDeltaT {

    @Test
    public void [estimateForDate_FutureDate_100Years_ReturnsCorrectDeltaT() {
        LocalDate date = LocalDate.of(2112, 6, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(-20, deltaT, 0.00001);
    }

}