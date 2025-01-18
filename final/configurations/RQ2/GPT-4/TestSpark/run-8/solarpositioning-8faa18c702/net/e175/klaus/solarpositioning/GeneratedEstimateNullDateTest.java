package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedEstimateNullDateTest {

    @Test
    public void estimateNullDateTest() {
        LocalDate time = Mockito.mock(LocalDate.class);
        Mockito.when(time.getYear()).thenReturn(null);
        DeltaT.estimate(time);
    }

}