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
public class GeneratedEstimate_20220115 returnsCorrectDeltaT {

    @Mock
    private LocalDate forDate;

    @Before
    public void setup() {
        when(forDate.getYear()).thenReturn(2022);
        when(forDate.getMonthValue()).thenReturn(1);
        when(forDate.getDayOfMonth()).thenReturn(15);
    }

    @Test
    public void estimate_20220115

    returnsCorrectDeltaT() {
        // Given
        double expected = 10.5;
        when(DeltaT.estimate(Mockito.any(LocalDate.class))).thenAnswer(i -> expected);

        // When
        double actual = DeltaT.estimate(forDate);

        // Then
        assertEquals(expected, actual);
    }

}