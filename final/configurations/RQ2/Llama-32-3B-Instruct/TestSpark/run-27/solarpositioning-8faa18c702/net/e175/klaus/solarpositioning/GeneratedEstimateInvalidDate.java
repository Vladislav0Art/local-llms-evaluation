package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

import org.mockito.Mockito;

public class GeneratedEstimateInvalidDate {

    @Test
    public void estimateInvalidDate() {
        LocalDate invalidDate = LocalDate.now();
        when(DeltaT.estimate(Mockito.any(LocalDate.class))).thenReturn(Double.POSITIVE_INFINITY);
        assertThat(DeltaT.estimate(invalidDate), is(Double.POSITIVE_INFINITY));
    }

}