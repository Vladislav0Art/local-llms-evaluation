package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimateForSameDateReturnsSameValue {

    @Mock
    private Calendar calendar;

    @Test
    public void estimateForSameDateReturnsSameValue() {
        when(calendar.getTime()).thenReturn(LocalDate.now().atStartOfDay());
        double result = DeltaT.estimate(LocalDate.now());
        assertEquals(0, result);
    }

}