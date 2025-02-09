package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void estimateNullDateTest() {
        try {
            DeltaT.estimate(null);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException ex) {
            // success
        }
    }

    @Test
    public void estimatePastDateTest() {
        LocalDate date = LocalDate.of(1990, 1, 1);
        double estimatedValue = DeltaT.estimate(date);
        assertNotNull(estimatedValue);
    }

    @Test
    public void estimateFutureDateTest() {
        LocalDate date = LocalDate.now().plusYears(10);
        double estimatedValue = DeltaT.estimate(date);
        assertNotNull(estimatedValue);
    }

    @Test
    public void estimatePresentDateTest() {
        LocalDate date = LocalDate.now();
        double estimatedValue = DeltaT.estimate(date);
        assertNotNull(estimatedValue);
    }

    @Test
    public void estimateMockDateTest() {
        LocalDate date = Mockito.mock(LocalDate.class);
        Mockito.when(date.getYear()).thenReturn(2000);
        Mockito.when(date.getMonth()).thenReturn(java.time.Month.JANUARY);
        Mockito.when(date.getDayOfMonth()).thenReturn(1);
        double estimatedValue = DeltaT.estimate(date);
        assertNotNull(estimatedValue);
    }

}