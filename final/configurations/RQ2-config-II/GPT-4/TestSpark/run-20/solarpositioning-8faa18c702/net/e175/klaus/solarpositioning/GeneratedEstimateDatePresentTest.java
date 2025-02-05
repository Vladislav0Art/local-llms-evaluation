package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateDatePresentTest {

    private static final double DELTA = 0.01;

    @Test
    public void estimateDatePresentTest() {
        LocalDate date = LocalDate.of(2022, 1, 1);
        double delta = DeltaT.estimate(date);
        assertEquals(68.97, delta, DELTA);
    }

}