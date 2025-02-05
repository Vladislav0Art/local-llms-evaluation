package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.*;

public class GeneratedEstimateLeapYearTest {

    @Test
    public void estimateLeapYearTest() {
        LocalDate leapYearDate = LocalDate.of(2000, Month.FEBRUARY, 29);
        double actual = DeltaT.estimate(leapYearDate);
        assertNotNull(actual);
    }

}