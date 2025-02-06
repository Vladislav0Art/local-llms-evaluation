package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_SameDayDifferentTime_ReturnsSameValue {

    @Test
    public void estimate_SameDayDifferentTime_ReturnsSameValue() {
        LocalDate forDate = LocalDate.of(2022, 6, 21);
        double valueAt12 = DeltaT.estimate(forDate.atStartOfDay());
        double valueAt23 = DeltaT.estimate(forDate.atTime(23));
        assertThat(valueAt12, is(not(DeltaT.estimate(forDate.atTime(23))));
    }

}