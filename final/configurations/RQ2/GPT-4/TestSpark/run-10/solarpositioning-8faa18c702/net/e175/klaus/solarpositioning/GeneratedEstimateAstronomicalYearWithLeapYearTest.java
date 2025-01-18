package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedEstimateAstronomicalYearWithLeapYearTest {

    @Test
    public void estimateAstronomicalYearWithLeapYearTest() {
        LocalDate date = LocalDate.of(1984, 2, 29);
        double result = DeltaT.estimate(date);
        assertEquals(55.48, result, 0.001);
    }

}