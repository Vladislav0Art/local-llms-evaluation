package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static java.lang.Math.pow;

public class GeneratedTestEstimateForValidDateAndTimeDefaultValue {

    @Test
    public void testEstimateForValidDateAndTimeDefaultValue() {
        LocalDate forDate = LocalDate.of(2022, 1, 15);
        double expectedResult = DeltaT.estimateForValidDateAndTime();
        assertEquals(DeltaT.estimateForInvalidDate(), expectedResult); // fix: compare the default value with the expected result
    }

}