package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;

import org.mockito.Mockito;
import org.junit.After;

public class GeneratedEstimateIsInvalidDate {

    @After
    public void tearDown() {
        Mockito.reset();
    }

    @Test
    public void estimateIsInvalidDate() {
        LocalDate invalidDate = LocalDate.now();
        when(DeltaT.estimate(Mockito.any(LocalDate.class))).thenReturn(Double.POSITIVE_INFINITY);
        assertEquals(Double.POSITIVE_INFINITY, (double) DeltaT.estimate(invalidDate), 1e-9);
    }

}