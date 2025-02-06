package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.LocalDate;

import static java.lang.Math.pow;

public class GeneratedEstimate_DifferentDate_ReturnsDifferentValue {

    @Test
    public void estimate_DifferentDate_ReturnsDifferentValue() {
        LocalDate forDate1 = LocalDate.of(2022, 6, 21);
        LocalDate forDate2 = LocalDate.of(2022, 7, 20);
        assertThat(DeltaT.estimate(forDate1), is(not(DeltaT.estimate(forDate2))));
    }

}