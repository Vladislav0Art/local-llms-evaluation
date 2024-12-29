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

public class GeneratedEstimateNonLeapYearTest {

    @Test
    public void estimateNonLeapYearTest() {
        LocalDate forDate = LocalDate.of(2021, Month.FEBRUARY, 28);
        double result = DeltaT.estimate(forDate);
        assertEquals(0.0, result, 0.0001);
    }

}