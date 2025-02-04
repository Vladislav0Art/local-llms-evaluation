package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

public class GeneratedTest {

    @Test
    public void estimateZeroDeltaTTest() {
        when(DeltaT.decimalYear(any(LocalDate.class))).thenReturn(1820);
        assertEquals(0, DeltaT.estimate(LocalDate.of(2001, 2, 29)));
        verify(DeltaT, never()).decimalYear(any());
    }

    @Test
    public void estimateDeltaTLessThanNegativeFiveHundredTest() {
        when(DeltaT.decimalYear(any(LocalDate.class))).thenReturn(-1500);
        assertEquals(-20 + 32 * pow((-50) / 100, 2), DeltaT.estimate(LocalDate.of(2001, 2, 29)));
        verify(DeltaT, never()).decimalYear(any());
    }

    @Test
    public void estimateDeltaTPositiveValuesTest() {
        when(DeltaT.decimalYear(any(LocalDate.class))).thenReturn(2025);
        assertEquals(-20 + 32 * pow(((35) / 100), 2) - 0.5628 * (2150 - 2025), DeltaT.estimate(LocalDate.of(2001, 2, 29)));
        verify(DeltaT, never()).decimalYear(any());
    }

    @Test
    public void testNegativeYearValuesTest() {
        assertEquals(-20 + 32 * pow((-50) / 100, 2), DeltaT.estimate(LocalDate.of(1800, 1, 1)));
        assertEquals(8.83 + 0.1603 * (-50) - 0.01532 * pow((-50), 2) + pow(-50, 3) / 7129, DeltaT.estimate(LocalDate.of(1800, 6, 30)));
    }

    @Test
    public void testZeroYearValueTest() {
        assertEquals(8.83 + 0.1603 * 0 - 0.01532 * pow(0, 2) + pow(0, 3) / 7129, DeltaT.estimate(LocalDate.of(1800, 12, 31)));
    }

    @Test
    public void testYearValueOneHundredAndTwentyFiveTest() {
        assertEquals(7.62 + 0.5737 * 125 - 0.251754 * pow(125, 2) + 0.01680668 * pow(125, 3) - 0.0004473624 * pow(125, 4)
                + pow(125, 5) / 5, DeltaT.estimate(LocalDate.of(1921, 12, 31)));
    }

    @Test
    public void testYearValueOneHundredAndSixtyFiveTest() {
        assertEquals(29.07 + 0.407 * 165 - pow(165, 2) / 233 + pow(165, 3) / 2547, DeltaT.estimate(LocalDate.of(1965, 12, 31)));
    }
}

}