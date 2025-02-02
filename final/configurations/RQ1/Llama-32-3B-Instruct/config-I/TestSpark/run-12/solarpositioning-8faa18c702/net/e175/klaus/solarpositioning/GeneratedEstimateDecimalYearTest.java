package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimateDecimalYearTest {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimateDecimalYearTest() {
        when(forDate.getYear()).thenReturn(2010);
        when(forDate.getMonthValue()).thenReturn(10);
        double result = DeltaT.decimalYear(forDate);
        assertEquals(2010, result + (forDate.getMonthValue() - 0.5) / 12);
    }

}