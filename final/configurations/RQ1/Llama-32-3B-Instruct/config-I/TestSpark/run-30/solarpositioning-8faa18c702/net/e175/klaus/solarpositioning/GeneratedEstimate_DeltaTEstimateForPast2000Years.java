package net.e175.klaus.solarpositioning;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import java.time.LocalDate;

public class GeneratedEstimate_DeltaTEstimateForPast2000Years {

    @Test
    public void estimate_DeltaTEstimateForPast2000Years() {
        LocalDate date = LocalDate.of(1800, 1, 1);
        double deltaT = DeltaT.estimate(date);
        MatcherAssert.assertThat(deltaT, Matchers.is(-20));
    }

}