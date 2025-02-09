package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.junit.Assert;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsInstanceOf;

import java.time.LocalDate;

import static org.junit.Assert.assertThrows;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimateForLeapDay_ReturnsCorrectDeltaT {

    @Test
    public void estimateForLeapDay_ReturnsCorrectDeltaT() {
        LocalDate forDate = LocalDate.of(2024, 2, 29); // Leap day in year 2024

        double expectedValue = -0.0000226; // hardcoded value for demonstration purposes only
        double actualValue = DeltaT.estimate(forDate);

        MatcherAssert.assertThat(actualValue, Is.is(expectedValue));
    }

}