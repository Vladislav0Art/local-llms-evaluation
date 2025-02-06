package net.e175.klaus.solarpositioning;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_CorrectDeltaTGivenNoLeapYear ReturnsCorrectValue {

    @BeforeClass
    public static void setup() {
        // Initialize necessary variables or classes here if needed
    }

    @Test
    public void estimate_CorrectDeltaTGivenNoLeapYear

    ReturnsCorrectValue() {
        LocalDate date = LocalDate.of(2020, 1, 1);
        double expected = 365.242199; // Approximate value for delta T given no leap year
        double actual = DeltaT.estimate(date);
        org.junit.Assert.assertEquals(expected, actual, 0.00001);
    }

}