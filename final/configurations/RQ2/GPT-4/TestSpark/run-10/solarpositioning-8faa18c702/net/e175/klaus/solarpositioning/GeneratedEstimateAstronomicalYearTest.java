package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedEstimateAstronomicalYearTest {

    @Test
    public void estimateAstronomicalYearTest() {
        LocalDate date = LocalDate.of(1986, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(56.75, result, 0.001);
    }

}