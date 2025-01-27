package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.time.LocalDate;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedEstimateForValidDate_ReturnsPositiveDeltaT {

    @Test
    public void estimateForValidDate_ReturnsPositiveDeltaT() {
        LocalDate forDate = LocalDate.of(2022, 6, 15);
        double actualDeltaT = DeltaT.estimate(forDate);
        assertThat(actualDeltaT, greaterThanZero());
    }
}

class HelperMethods {

    public static boolean greaterThanZero(double value) {
        return value > 0;
    }

}