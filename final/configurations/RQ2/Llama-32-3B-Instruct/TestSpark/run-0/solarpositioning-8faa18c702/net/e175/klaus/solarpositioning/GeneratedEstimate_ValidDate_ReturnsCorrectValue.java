package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

public class GeneratedEstimate_ValidDate_ReturnsCorrectValue {

    @Mock
    private DeltaT deltaT;

    @Test
    public void estimate_ValidDate_ReturnsCorrectValue() throws Exception {
        when(deltaT.estimate(LocalDate.now())).thenReturn(0d);
        assertEquals(0d, deltaT.estimate(LocalDate.now()));
    }

}