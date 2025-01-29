package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestEstimate_MultipleInstances {

    @Test
    public void testEstimate_MultipleInstances() {
        LocalDate forDate1 = LocalDate.of(2022, 1, 1);
        LocalDate forDate2 = LocalDate.of(2022, 1, 1);

        double expectedValue1 = -0.0012345678901234567;
        double expectedValue2 = -0.0012345678901234568;

        when(DeltaT.estimate(forDate1)).thenReturn(expectedValue1);
        when(DeltaT.estimate(forDate2)).thenReturn(expectedValue2);

        double actualValue1 = DeltaT.estimate(forDate1);
        double actualValue2 = DeltaT.estimate(forDate2);

        assertNotEquals(expectedValue1, actualValue1);
        assertNotEquals(expectedValue2, actualValue2);
    }

}