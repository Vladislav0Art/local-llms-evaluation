package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_WhenForDateIsOnFirstDayOfYear_ReturnsPositiveInfinity {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimate_WhenForDateIsOnFirstDayOfYear_ReturnsPositiveInfinity() {
        when(forDate.isAfter(LocalDate.of(2022, 1, 1))).thenReturn(false);
        when(forDate.isBefore(LocalDate.of(2023, 1, 1))).thenReturn(true);
        double result = DeltaT.estimate(forDate);
        assertEquals(Double.POSITIVE_INFINITY, result);
    }

}