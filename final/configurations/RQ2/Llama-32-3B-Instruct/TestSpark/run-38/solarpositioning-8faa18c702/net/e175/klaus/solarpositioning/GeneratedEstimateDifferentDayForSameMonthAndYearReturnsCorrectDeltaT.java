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
public class GeneratedEstimateDifferentDayForSameMonthAndYearReturnsCorrectDeltaT {

    @Test
    public void estimateDifferentDayForSameMonthAndYearReturnsCorrectDeltaT() {
        // Given
        LocalDate forDate = LocalDate.of(2000, 1, 15).plusDays(1);
        Mockito.when(DeltaTStub.estimate(any(LocalDate.class))).thenReturn(11.0);

        // When
        double result = DeltaT.estimate(forDate);

        // Then
        assertEquals(11.0, result, 1e-9);
    }

}