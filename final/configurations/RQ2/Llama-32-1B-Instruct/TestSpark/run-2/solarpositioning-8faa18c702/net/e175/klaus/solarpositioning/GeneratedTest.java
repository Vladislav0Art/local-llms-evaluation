package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    public double estimate(LocalDate date) {
        return pow(1 - (date.getYear() / 100), (date.getMonthValue() / 12) * 29.444);
    }

    @Test
    public void testEstimate_NoException() {
        double result = DeltaT.estimate(forDate);
        assertEquals(0, result);
    }

    @Test
    public void testEstimate_MediumValue() {
        when(DeltaT.estimate(forDate)).thenReturn(10.0); // medium value for demonstration purposes
        double result = DeltaT.estimate(forDate);
        assertEquals(10.0, result);
    }

    @Test
    public void testEstimate_LargeValue() {
        when(DeltaT.estimate(forDate)).thenReturn(-20.0); // large value to test the estimate function
        double result = DeltaT.estimate(forDate);
        assertEquals(-20.0, result);
    }

}