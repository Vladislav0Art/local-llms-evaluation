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
public class GeneratedEstimateForSameDayDifferentYear_ReturnsSameValue {

    @Test
    public void estimateForSameDayDifferentYear_ReturnsSameValue() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        DateUtils.setDate(yearForDate, forDate);

        double expectedValue = 0.0000046; // hardcoded value for demonstration purposes only
        double actualValue = DeltaT.estimate(forDate);

        MatcherAssert.assertThat(actualValue, Is.is(expectedValue));
    }

}