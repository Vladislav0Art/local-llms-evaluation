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
public class GeneratedTestLeapDay {

    @Test
    public void testLeapDay() {
        LocalDate forDate = LocalDate.of(2024, 2, 29); // Leap day in year 2024

        double expectedValue = -0.0000226; // hardcoded value for demonstration purposes only
        double actualValue = DeltaT.estimate(forDate);

        assertThat(actualValue, Is.is(expectedValue));
    }

}