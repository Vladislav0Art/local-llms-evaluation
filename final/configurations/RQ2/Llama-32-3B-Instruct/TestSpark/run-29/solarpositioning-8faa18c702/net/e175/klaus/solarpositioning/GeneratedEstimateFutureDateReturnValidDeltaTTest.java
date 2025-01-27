package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.Calendar;
import java.lang.Math;

public class GeneratedEstimateFutureDateReturnValidDeltaTTest {

    @Test
    public void estimateFutureDateReturnValidDeltaTTest() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 1);
        LocalDate futureDate = calendar.getTime().toLocalDate();
        double result = DeltaT.estimate(futureDate);
        assertTrue(!Double.isNaN(result) && Math.abs(Math.PI / 180 * (1 / 360 * 12) - result) < 0.01);
    }

}