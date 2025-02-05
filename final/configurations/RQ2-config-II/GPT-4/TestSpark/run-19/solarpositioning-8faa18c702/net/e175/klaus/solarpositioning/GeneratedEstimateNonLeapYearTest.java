package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.*;

public class GeneratedEstimateNonLeapYearTest {

    @Test
    public void estimateNonLeapYearTest() {
        LocalDate nonLeapYearDate = LocalDate.of(2003, Month.JUNE, 27);
        double actual = DeltaT.estimate(nonLeapYearDate);
        assertNotNull(actual);
    }

}