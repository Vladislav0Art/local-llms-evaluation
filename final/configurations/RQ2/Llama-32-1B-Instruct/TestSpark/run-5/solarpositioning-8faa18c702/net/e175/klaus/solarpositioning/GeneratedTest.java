package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    private final DeltaT deltaT = new DeltaT();

    @Test
    public void [MethodUnderTest][Scenario]

    Test_estimate_Simple() {
        LocalDate forDate = LocalDate.now();
        double expected = Math.pow(2, 23) / 1000; // approximately 1 day
        double actual = deltaT.estimate(forDate);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void [MethodUnderTest][Scenario]

    Test_estimate_GoodMatch() {
        LocalDate forDate = LocalDate.now().plusDays(3);
        double expected = Math.pow(2, 23) / 1000; // approximately 1 day
        double actual = deltaT.estimate(forDate);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void [MethodUnderTest][Scenario]

    Test_estimate_WrongMatch() {
        LocalDate forDate = LocalDate.now().minusDays(2);
        double expected = Math.pow(2, 23) / 1000; // approximately 1 day
        double actual = deltaT.estimate(forDate);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void [MethodUnderTest][Scenario]

    Test_estimate_DifferentUnit() {
        LocalDate forDate = LocalDate.now();
        double expected = Math.pow(2, 23); // approximately 1 year
        double actual = deltaT.estimate(forDate);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void [MethodUnderTest][Scenario]

    Test_estimate_SmallDifference() {
        LocalDate forDate = LocalDate.now().minusDays(100);
        double expected = Math.pow(2, 23); // approximately 1 year
        double actual = deltaT.estimate(forDate);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void [MethodUnderTest][Scenario]

    Test_estimate_WrongParameter() {
        LocalDate forDate = LocalDate.now();
        Mockito.when(deltaT.estimate(Mockito.any(LocalDate))).thenReturn(10.0);
        try {
            deltaT.estimate(forDate);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

}