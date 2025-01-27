package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.IsNot.is;

import java.time.LocalDate;

public class GeneratedTestEstimateDeltaTSameForDifferentDatesAtSameTime {

    @Test
    public void testEstimateDeltaTSameForDifferentDatesAtSameTime() {
        LocalDate forDate1 = LocalDate.now().minusDays(10);
        LocalDate forDate2 = LocalDate.now().minusDays(10); // Same time and date but different years
        double result1 = DeltaT.estimate(forDate1);
        double result2 = DeltaT.estimate(forDate2);
        assertThat(result1, is(result2));
    }

}