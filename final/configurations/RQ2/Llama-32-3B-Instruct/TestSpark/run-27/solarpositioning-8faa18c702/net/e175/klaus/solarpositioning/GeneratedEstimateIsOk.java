package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;
import org.junit.After;

public class GeneratedEstimateIsOk {

    @After
    public void tearDown() {
        Mockito.reset();
    }

    @Test
    public void estimateIsOk() {
        when(DeltaT.estimate(Mockito.any(LocalDate.class))).thenReturn(1.0);
        assertEquals(1.0, (double) DeltaT.estimate(LocalDate.of(2022, 1, 1)), 1e-9);
    }

}