package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimateFutureCenturyDateTest {

    @Test
    public void estimateFutureCenturyDateTest() {
        LocalDate date = LocalDate.of(2100, 1, 1);
        double delta = DeltaT.estimate(date);

        assertTrue(delta > 0);
    }

}