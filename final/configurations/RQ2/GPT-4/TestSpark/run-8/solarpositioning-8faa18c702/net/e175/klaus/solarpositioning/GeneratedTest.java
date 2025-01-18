package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void estimateNegativeYearTest() {
        double estimatedValue = DeltaT.estimate(LocalDate.of(-500, 1, 1));
        assertEquals(-20, estimatedValue, 0.0);
    }

    @Test
    public void estimateLeapYearTest() {
        double estimatedValue = DeltaT.estimate(LocalDate.of(2000, 1, 1));
        assertEquals(63.83, estimatedValue, 0.01);
    }

    @Test
    public void estimateZeroYearTest() {
        double estimatedValue = DeltaT.estimate(LocalDate.of(0, 1, 1));
        assertEquals(0, estimatedValue, 1.0);
    }

    @Test
    public void estimateFutureYearTest() {
        DeltaT.estimate(LocalDate.of(3000, 1, 1));
    }

    @Test
    public void estimateNullDateTest() {
        LocalDate time = Mockito.mock(LocalDate.class);
        Mockito.when(time.getYear()).thenReturn(null);
        DeltaT.estimate(time);
    }

}