package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestEstimate_SingleInstance {

    @Test
    public void testEstimate_SingleInstance() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        double expectedValue = -0.0012345678901234567;

        when(DeltaT.estimate(forDate)).thenReturn(expectedValue);

        LocalDate futureDate = LocalDate.now().plusDays(10);
        double actualValue = DeltaT.estimate(futureDate);
        assertNotEquals(expectedValue, actualValue);
    }

}