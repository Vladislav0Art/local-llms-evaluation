package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.*;

public class GeneratedEstimateYearBeforeLeapYearTest {

    @Test
    public void estimateYearBeforeLeapYearTest() {
        LocalDate yearBeforeLeapYearDate = LocalDate.of(1999, Month.JULY, 30);
        double actual = DeltaT.estimate(yearBeforeLeapYearDate);
        assertNotNull(actual);
    }

}