package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimatePrehistoricDateTest {

    @Test
    public void estimatePrehistoricDateTest() {
        LocalDate date = LocalDate.of(0, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(17190.0, deltaT, 0.01);
    }

}