package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestEstimate_Temperature {

    @Test
    public void testEstimate_Temperature() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        double expectedValue = -0.0012345678901234567;

        when(DeltaT.estimate(forDate)).thenReturn(expectedValue);

        DeltaTDeltaT deltaT = new DeltaT();
        double actualValue = deltaT.getTemperature(forDate);

        assertNotEquals(expectedValue, actualValue);
    }

}