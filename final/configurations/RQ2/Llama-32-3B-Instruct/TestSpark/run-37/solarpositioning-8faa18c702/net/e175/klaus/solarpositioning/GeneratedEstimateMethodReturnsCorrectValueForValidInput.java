package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimateMethodReturnsCorrectValueForValidInput {

    public static final LocalDate FOR_DATE = LocalDate.of(2022, 1, 15);

    @Mock
    private LocalDate mockForDate;

    @Test
    public void estimateMethodReturnsCorrectValueForValidInput() {
        when(mockForDate.getYear()).thenReturn(2022);
        when(mockForDate.getMonthValue()).thenReturn(1);
        when(mockForDate.getDayOfMonth()).thenReturn(15);
        assertEquals(DeltaT.estimateForValidInput(FOR_DATE), 6.193);
    }

}