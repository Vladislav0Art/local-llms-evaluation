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
public class GeneratedEstimateYearBefore500Test {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimateYearBefore500Test() {
        when(forDate.getYear()).thenReturn(400);
        double result = DeltaT.estimate(forDate);
        assertTrue(result >= 10583.6 && result <= 10950.1);
    }

}