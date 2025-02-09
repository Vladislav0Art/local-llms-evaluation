package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedEstimateLeapYearTest {

    @Test
    public void estimateLeapYearTest() {
        LocalDate date = LocalDate.of(2020, 2, 29);
        double result = DeltaT.estimate(date);
        assertNotNull(result);
    }

}