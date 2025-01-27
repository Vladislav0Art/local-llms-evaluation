package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.IsNot.is;

import java.time.LocalDate;

public class GeneratedTestEstimateDeltaTForAnyDateReturnsZero {

    @Test
    public void testEstimateDeltaTForAnyDateReturnsZero() {
        LocalDate forDate = LocalDate.now();
        double result = DeltaT.estimate(forDate);
        assertThat(result, is(0));
    }

}