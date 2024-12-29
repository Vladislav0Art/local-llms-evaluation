package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

public class GeneratedEstimate_InvalidDate_ThrowsNullPointerException {

    @Mock
    private DeltaT deltaT;

    @Test
    public void estimate_InvalidDate_ThrowsNullPointerException() {
        assertTrue(() -> deltaT.estimate(null).getClass().equals(NullPointerException.class));
    }

}