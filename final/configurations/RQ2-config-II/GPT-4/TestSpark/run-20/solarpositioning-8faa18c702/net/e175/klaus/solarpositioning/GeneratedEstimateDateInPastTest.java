package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateDateInPastTest {

    private static final double DELTA = 0.01;

    @Test
    public void estimateDateInPastTest() {
        LocalDate date = LocalDate.of(1900, 1, 31);
        double delta = DeltaT.estimate(date);
        assertEquals(123.83, delta, DELTA);
    }

}