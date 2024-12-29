package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import static java.lang.Math.pow;

public class GeneratedEstimateValidDateTest {

    @Test
    public void estimateValidDateTest() {
        LocalDate forDate = LocalDate.of(2022, Month.JANUARY, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(0.0, result, 0.0001);
    }

}