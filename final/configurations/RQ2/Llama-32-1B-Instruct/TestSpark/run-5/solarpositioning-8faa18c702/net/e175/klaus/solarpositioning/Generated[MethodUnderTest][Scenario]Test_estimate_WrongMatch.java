package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Generated[MethodUnderTest][Scenario]

Test_estimate_WrongMatch {

    private final DeltaT deltaT = new DeltaT();

    @Test
    public void [MethodUnderTest][Scenario]Test_estimate_WrongMatch() {
        LocalDate forDate = LocalDate.now().minusDays(2);
        double expected = Math.pow(2, 23) / 1000; // approximately 1 day
        double actual = deltaT.estimate(forDate);
        assertEquals(expected, actual, 0.001);
    }

}