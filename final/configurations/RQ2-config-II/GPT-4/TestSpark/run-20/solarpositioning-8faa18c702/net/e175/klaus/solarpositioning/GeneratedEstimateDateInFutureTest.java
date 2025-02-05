package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateDateInFutureTest {

    private static final double DELTA = 0.01;

    @Test
    public void estimateDateInFutureTest() {
        LocalDate date = LocalDate.of(2100, 1, 1);
        double delta = DeltaT.estimate(date);
        assertEquals(184.92, delta, DELTA);
    }

}