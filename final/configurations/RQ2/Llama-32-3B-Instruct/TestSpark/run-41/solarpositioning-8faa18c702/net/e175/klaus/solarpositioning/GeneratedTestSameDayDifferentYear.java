package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.hamcrest.MatcherAssert;
import org.hamcrest.CoreMatchers;

import static org.hamcrest.CoreMatchers.Is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestSameDayDifferentYear {

    @Test
    public void testSameDayDifferentYear() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        DateUtils.setDate(yearForDate(), forDate);

        double expectedValue = 0.0000046; // hardcoded value for demonstration purposes only
        double actualValue = DeltaT.estimate(forDate);

        assertThat(actualValue, Is.is(expectedValue));
    }

}