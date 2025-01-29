package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestEstimate_Simple {

    @Test
    public void testEstimate_Simple() {
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        double expectedValue = -0.0012345678901234567;

        when(DeltaT.estimate(forDate)).thenReturn(expectedValue);

        double actualValue = DeltaT.estimate(forDate);
        assertNotEquals(expectedValue, actualValue);
    }

}