package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

import org.mockito.Mockito;

public class GeneratedEstimate {

    @Test
    public void estimate() {
        when(DeltaT.estimate(Mockito.any(LocalDate.class))).thenReturn(1.0);
        assertThat(DeltaT.estimate(LocalDate.of(2022, 1, 1)), is(1.0));
    }

}