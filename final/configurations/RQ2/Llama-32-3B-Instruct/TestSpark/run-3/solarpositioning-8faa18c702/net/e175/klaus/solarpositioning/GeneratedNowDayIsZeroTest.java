package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;

public class GeneratedNowDayIsZeroTest {

    @Test
    public void nowDayIsZeroTest() {
        LocalDate date = LocalDate.of(2022, 1, 1);
        assertEquals(DeltaT.estimate(date), -0.000043667, 1e-9); // using delta T on January 1st (Eastern Standard Time)
    }

}