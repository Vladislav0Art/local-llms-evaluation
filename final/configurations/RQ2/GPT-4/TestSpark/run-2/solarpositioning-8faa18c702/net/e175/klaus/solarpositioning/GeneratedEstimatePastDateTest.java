package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimatePastDateTest {

    @Test
    public void estimatePastDateTest() {
        LocalDate date = LocalDate.of(1950, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertEquals(29.1, deltaT, 0.01);
    }

}