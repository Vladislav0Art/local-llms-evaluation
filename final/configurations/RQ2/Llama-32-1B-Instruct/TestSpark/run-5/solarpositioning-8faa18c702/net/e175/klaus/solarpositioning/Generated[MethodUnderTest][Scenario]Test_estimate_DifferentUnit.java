package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Generated[MethodUnderTest][Scenario]

Test_estimate_DifferentUnit {

    private final DeltaT deltaT = new DeltaT();

    @Test
    public void [MethodUnderTest][Scenario]Test_estimate_DifferentUnit() {
        LocalDate forDate = LocalDate.now();
        double expected = Math.pow(2, 23); // approximately 1 year
        double actual = deltaT.estimate(forDate);
        assertEquals(expected, actual, 0.001);
    }

}