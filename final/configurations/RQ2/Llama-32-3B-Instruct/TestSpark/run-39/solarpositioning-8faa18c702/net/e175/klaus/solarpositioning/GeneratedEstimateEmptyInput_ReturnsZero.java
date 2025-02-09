package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimateEmptyInput_ReturnsZero {

    @Mock
    private LocalDate forDate;

    public void setup() {
        when(forDate.atDayOfMonth(1)).thenReturn(LocalDate.of(2022, Month.DECEMBER, 15));
        when(forDate.atDayOfMonth(30)).thenReturn(LocalDate.of(2023, Month.DECEMBER, 15));
        when(forDate.atDayOfMonth(31)).thenReturn(LocalDate.of(2024, Month.DECEMBER, 16));
    }

    @Test
    public void estimateEmptyInput_ReturnsZero() {
        setup();
        double result = DeltaT.estimate(forDate);
        assertEquals(0, result, 1e-6);
    }

}