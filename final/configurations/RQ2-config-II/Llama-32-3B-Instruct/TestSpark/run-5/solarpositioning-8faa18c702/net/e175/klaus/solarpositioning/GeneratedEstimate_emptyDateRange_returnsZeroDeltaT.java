package net.e175.klaus.solarpositioning;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_emptyDateRange_returnsZeroDeltaT {

    @Mock
    private LocalDate forDate;

    @Before
    public void setup() {
        when(forDate.getYear()).thenReturn(2022);
        when(forDate.getMonthValue()).thenReturn(1);
        when(forDate.getDayOfMonth()).thenReturn(15);
    }

    @Test
    public void estimate_emptyDateRange_returnsZeroDeltaT() {
        // Given
        LocalDate from = LocalDate.of(2022, 1, 15);
        LocalDate to = null;
        when(DeltaT.estimate(from)).thenReturn(10.0);

        // When
        double actual = DeltaT.estimate(from, to);

        // Then
        assertEquals(10.0, actual, 0.00001);
    }

}