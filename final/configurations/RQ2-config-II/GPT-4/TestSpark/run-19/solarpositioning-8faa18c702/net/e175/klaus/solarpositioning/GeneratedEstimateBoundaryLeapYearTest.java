package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.*;

public class GeneratedEstimateBoundaryLeapYearTest {

    @Test
    public void estimateBoundaryLeapYearTest() {
        LocalDate leapYearBoundaryDate = LocalDate.of(2004, Month.FEBRUARY, 28);
        double actual = DeltaT.estimate(leapYearBoundaryDate);
        assertNotNull(actual);
    }

}