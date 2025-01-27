package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;

public class GeneratedPastYearIsDeltaTMinusOneTest {

    @Test
    public void pastYearIsDeltaTMinusOneTest() {
        LocalDate date = LocalDate.of(2022, 12, 31);
        assertEquals(DeltaT.estimate(date), -0.000043667, 1e-9); // using delta T on December 31st (Eastern Standard Time)
    }

}