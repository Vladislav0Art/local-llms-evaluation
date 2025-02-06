package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_isNaN_forEmptyInput {

    @Mock
    private LocalDate forDate;

    @InjectMocks
    private DeltaT deltaT;

    @Test
    public void estimate_isNaN_forEmptyInput() {
        Mockito.when(forDate.isAfter()).thenReturn(true);
        Mockito.when(forDate.atStartOfDay().atZone(Mockito.any())).thenReturn(null);
        assertTrue(deltaT.estimate(forDate) == Double.NaN);
    }

}