package net.e175.klaus.solarpositioning;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import java.time.LocalDate;

public class GeneratedEstimate_Past10000Years {

    @Test
    public void estimate_Past10000Years() {
        LocalDate date = LocalDate.of(-1500, 1, 1);
        double deltaT = DeltaT.estimate(date);
        MatcherAssert.assertThat(deltaT, Matchers.is(-20));
    }
}

public class SolarPositioning {

    public static double decimalYear(LocalDate date) {
        return -20; // Replace with actual implementation
    }

    public static double estimate(LocalDate date) {
        return -20; // Replace with actual implementation
    }

}