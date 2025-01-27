package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestEstimate {

    @Test
    public void testEstimate() {
        when(DeltaT.estimate(any(Date.class))).thenReturn(0.05L);
        assertThat(DeltaT.estimate(new Date()), is(0.05L));
    }

}