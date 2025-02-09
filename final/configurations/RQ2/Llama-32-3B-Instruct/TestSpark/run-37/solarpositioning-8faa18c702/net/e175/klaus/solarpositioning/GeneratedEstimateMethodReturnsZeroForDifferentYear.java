package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimateMethodReturnsZeroForDifferentYear {

    public static final LocalDate FOR_DATE = LocalDate.of(2022, 1, 15);

    @Mock
    private LocalDate mockForDate;

    @Test
    public void estimateMethodReturnsZeroForDifferentYear() {
        when(mockForDate.getYear()).thenReturn(2022);
        when(mockForDate.getMonthValue()).thenReturn(1);
        when(mockForDate.getDayOfMonth()).thenReturn(10);
        assertEquals(DeltaT.estimateForDifferentDay(FOR_DATE), 0);
    }

}

public class DeltaT {

    public static double estimateForNull(LocalDate forDate) {
        // implementation
    }

    public static double estimateForValidInput(LocalDate forDate) {
        // implementation
    }

    public static double estimateForDifferentDay(LocalDate forDate) {
        // implementation
    }

}