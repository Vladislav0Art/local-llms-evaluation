package net.e175.klaus.solarpositioning;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import java.time.LocalDate;

public class GeneratedEstimate_Mid20thCentury {

    @Test
    public void estimate_Mid20thCentury() {
        LocalDate date = LocalDate.of(1945, 1, 1);
        double deltaT = DeltaT.estimate(date);
        MatcherAssert.assertThat(deltaT, Matchers.is(-2.79));
    }

}