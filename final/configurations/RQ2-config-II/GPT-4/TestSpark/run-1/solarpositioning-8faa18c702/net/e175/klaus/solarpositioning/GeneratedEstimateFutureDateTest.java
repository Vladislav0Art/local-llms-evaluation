package net.e175.klaus.solarpositioning;

import static org.junit.Assert.*;

import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateFutureDateTest {

    @Test
    public void estimateFutureDateTest() {
        LocalDate date = LocalDate.of(3000, 1, 1);
        assertNotEquals(0, DeltaT.estimate(date), 0.01);
    }

}