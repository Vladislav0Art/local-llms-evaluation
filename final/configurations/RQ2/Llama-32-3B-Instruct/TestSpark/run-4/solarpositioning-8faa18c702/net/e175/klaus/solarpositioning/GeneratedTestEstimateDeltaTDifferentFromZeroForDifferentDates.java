package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.IsNot.is;

import java.time.LocalDate;

public class GeneratedTestEstimateDeltaTDifferentFromZeroForDifferentDates {

    @Test
    public void testEstimateDeltaTDifferentFromZeroForDifferentDates() {
        LocalDate forDate1 = LocalDate.now().minusDays(10);
        LocalDate forDate2 = LocalDate.now().plusDays(5);
        double result1 = DeltaT.estimate(forDate1);
        double result2 = DeltaT.estimate(forDate2);
        assertThat(result1, not(is(0)));
        assertThat(result2, not(is(0)));
    }

}