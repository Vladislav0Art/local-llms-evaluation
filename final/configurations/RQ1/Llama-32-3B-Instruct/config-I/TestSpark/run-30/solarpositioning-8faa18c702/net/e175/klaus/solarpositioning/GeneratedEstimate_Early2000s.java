package net.e175.klaus.solarpositioning;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import java.time.LocalDate;

public class GeneratedEstimate_Early2000s {

    @Test
    public void estimate_Early2000s() {
        LocalDate date = LocalDate.of(1999, 1, 1);
        double deltaT = DeltaT.estimate(date);
        MatcherAssert.assertThat(deltaT, Matchers.is(63.86));
    }

}