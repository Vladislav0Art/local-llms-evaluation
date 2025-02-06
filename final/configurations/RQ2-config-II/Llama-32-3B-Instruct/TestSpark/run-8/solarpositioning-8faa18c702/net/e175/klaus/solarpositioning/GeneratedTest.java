package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedTest {

    @Test
    public void estimate_DenormalizedInput_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(1970, 1, 1);
        double result = DeltaT.estimate(forDate);
        assertEquals(6.0, result, 0.01);
    }

    @Test
    public void estimate_January_30th_1985_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(1985, 1, 30);
        double result = DeltaT.estimate(forDate);
        assertEquals(-11.5, result, 0.01);
    }

    @Test
    public void estimate_February_28th_1996_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(1996, 2, 28);
        double result = DeltaT.estimate(forDate);
        assertEquals(-10.8, result, 0.01);
    }

    @Test
    public void estimate_MidsummerNight_2017_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(2017, 6, 21);
        double result = DeltaT.estimate(forDate);
        assertEquals(-2.5, result, 0.01);
    }

    @Test
    public void estimate_December_31st_1999_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(1999, 12, 31);
        double result = DeltaT.estimate(forDate);
        assertEquals(-6.8, result, 0.01);
    }

    @Test
    public void estimate_January_31st_2001_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(2001, 1, 31);
        double result = DeltaT.estimate(forDate);
        assertEquals(-2.3, result, 0.01);
    }

}