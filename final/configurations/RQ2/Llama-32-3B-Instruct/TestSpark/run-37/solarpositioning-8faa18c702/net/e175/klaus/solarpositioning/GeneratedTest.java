package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    public static final LocalDate FOR_DATE = LocalDate.of(2022, 1, 15);

    @Mock
    private LocalDate mockForDate;

    @Test
    public void estimateMethodReturnsZeroForNullInput() {
        when(forDate).thenReturn(null);
        assertEquals(0, DeltaT.estimate(null));
    }

    @Test
    public void estimateMethodReturnsCorrectValueForValidInput() {
        when(forDate.getYear()).thenReturn(2022);
        when(forDate.getMonthValue()).thenReturn(1);
        when(forDate.getDayOfMonth()).thenReturn(15);
        assertEquals(6.193, DeltaT.estimate(forDate), 0.001);
    }

}