package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_DatesBeforeEpochReturnsNegative {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimate_DatesBeforeEpochReturnsNegative() {
        when(forDate.atDay(1)).thenReturn(LocalDate.of(1970, 1, 1));
        assertEquals(-24.000002, DeltaT.estimate(forDate), 0.001);
    }

}