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
public class GeneratedTestDifferentDay {

    @Test
    public void testDifferentDay() {
        LocalDate forDate1 = LocalDate.of(2022, 12, 31);
        DateUtils.setDate(dayForDate1(), forDate1);

        double expectedValue = -0.0000204; // hardcoded value for demonstration purposes only
        double actualValue = DeltaT.estimate(forDate1);

        assertThat(actualValue, Is.is(expectedValue));
    }

}