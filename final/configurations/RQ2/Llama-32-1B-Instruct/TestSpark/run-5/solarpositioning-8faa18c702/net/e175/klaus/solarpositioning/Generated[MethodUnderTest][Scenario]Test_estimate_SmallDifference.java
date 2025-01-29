package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Generated[MethodUnderTest][Scenario]

Test_estimate_SmallDifference {

    private final DeltaT deltaT = new DeltaT();

    @Test
    public void [MethodUnderTest][Scenario]Test_estimate_SmallDifference() {
        LocalDate forDate = LocalDate.now().minusDays(100);
        double expected = Math.pow(2, 23); // approximately 1 year
        double actual = deltaT.estimate(forDate);
        assertEquals(expected, actual, 0.001);
    }

}