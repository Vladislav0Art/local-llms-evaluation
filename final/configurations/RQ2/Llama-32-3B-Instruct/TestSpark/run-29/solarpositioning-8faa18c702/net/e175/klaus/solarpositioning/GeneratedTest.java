package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.Calendar;
import java.lang.Math;

public class GeneratedTest {

    @Test
    public void estimateEmptyDateReturnInvalidValueTest() {
        LocalDate emptyDate = null;
        double result = DeltaT.estimate(emptyDate);
        assertTrue(Double.isNaN(result));
    }

}