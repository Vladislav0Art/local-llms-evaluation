package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static java.lang.Math.pow;

public class GeneratedTestEstimateForZeroDeltaTime {

    @Test
    public void testEstimateForZeroDeltaTime() {
        LocalDate forDate = LocalDate.of(2022, 1, 15);
        double expectedResult = 0;
        Double result = DeltaT.estimate(forDate);
        assertEquals(expectedResult, result); // fix: assert that the returned value is equal to the expected one
    }

}