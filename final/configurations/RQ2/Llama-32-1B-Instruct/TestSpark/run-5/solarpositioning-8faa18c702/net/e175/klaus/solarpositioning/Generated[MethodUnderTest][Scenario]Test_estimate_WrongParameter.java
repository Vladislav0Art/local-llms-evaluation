package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Generated[MethodUnderTest][Scenario]

Test_estimate_WrongParameter {

    private final DeltaT deltaT = new DeltaT();

    @Test
    public void [MethodUnderTest][Scenario]Test_estimate_WrongParameter() {
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