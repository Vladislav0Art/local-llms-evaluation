package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestEstimate_GrowthRate {

    @Test
    public void testEstimate_GrowthRate() {
        LocalDate forDate = Mockito.mock(LocalDate.class);
        Mockito.when(forDate.plusDays(30)).thenReturn(Mockito.mock(LocalDate.class));
        double actual = DeltaT.estimate(forDate);
        assertDoubleEquals(Math.sqrt(100), actual, 0.00001);
    }

}