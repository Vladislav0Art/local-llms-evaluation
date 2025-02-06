package net.e175.klaus.solarpositioning;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_TooFarInThePastReturnsCorrectDelta {

    @BeforeClass
    public static void setup() {
        // Initialize necessary variables or classes here if needed
    }

    @Test
    public void estimate_TooFarInThePastReturnsCorrectDelta() {
        LocalDate date = LocalDate.of(1900, 1, 1); // Too far in the past for delta T model to be accurate
        double expected = 365.242199 + 184; // Approximate value for delta T given leap year that is too far in the past
        double actual = DeltaT.estimate(date);
        org.junit.Assert.assertEquals(expected, actual, 0.00001);
    }

}