package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedEstimatePastCenturyDateTest {

    @Test
    public void estimatePastCenturyDateTest() {
        LocalDate date = LocalDate.of(1900, 1, 1);
        double delta = DeltaT.estimate(date);

        assertTrue(delta > 0);
    }

}