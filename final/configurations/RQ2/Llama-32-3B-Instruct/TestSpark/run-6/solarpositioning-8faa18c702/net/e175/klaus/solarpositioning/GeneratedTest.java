package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doThrow;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedTest {

    @Test
    public void estimate_DifferentDate_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(2020, 1, 1);
        assertEquals(12.4400025, DeltaT.estimate(forDate), 0.001);
    }

    @Test
    public void estimate_SameDay_ReturnsSameValue() {
        LocalDate forDate = LocalDate.of(2020, 1, 1);
        forDate = forDate.plusDays(1);
        assertEquals(DeltaT.estimate(forDate), DeltaT.estimate(forDate), 0.001);
    }

    @Test
    public void estimate_DifferentYear_ReturnsCorrectValue() {
        LocalDate forDate = LocalDate.of(2022, 6, 20);
        assertEquals(-12.4400025, DeltaT.estimate(forDate), 0.001);
    }

}