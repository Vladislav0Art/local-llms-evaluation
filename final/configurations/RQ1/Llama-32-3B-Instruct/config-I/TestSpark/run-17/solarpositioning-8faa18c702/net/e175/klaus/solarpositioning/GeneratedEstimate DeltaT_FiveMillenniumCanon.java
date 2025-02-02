package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedEstimate DeltaT_FiveMillenniumCanon {

    @Test
    public void estimate

    DeltaT_FiveMillenniumCanon() {
        when(DeltaT.decimalYear(Mockito.any(LocalDate.class))).thenReturn(-500);
        double result = DeltaT.estimate(new LocalDate(100, 1, 1));
        assertTrue(result >= -20 && result <= 32);
    }

}