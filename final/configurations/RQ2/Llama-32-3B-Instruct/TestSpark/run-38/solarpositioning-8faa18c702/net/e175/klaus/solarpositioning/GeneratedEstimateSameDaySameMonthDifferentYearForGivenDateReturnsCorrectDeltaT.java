package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;
import net.e175.klaus.solarpositioning.DeltaTStub;
import net.e175.klaus.solarpositioning.SunLocation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimateSameDaySameMonthDifferentYearForGivenDateReturnsCorrectDeltaT {

    @Test
    public void estimateSameDaySameMonthDifferentYearForGivenDateReturnsCorrectDeltaT() {
        // Given
        LocalDate forDate = LocalDate.of(2001, 12, 15);
        Mockito.when(DeltaTStub.estimate(any(LocalDate.class))).thenReturn(3.0);

        // When
        double result = DeltaT.estimate(forDate);

        // Then
        assertEquals(3.0, result, 1e-9);
    }

}