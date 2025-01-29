package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import net.e175.klaus.solarpositioning.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedTestEstimateForFiveDaysNoException_throwsIllegalArgumentException {

    @Test
    public void testEstimateForFiveDaysNoException_throwsIllegalArgumentException() {
        LocalDate forDate = LocalDate.now();
        double result = TestUtils.mockDeltaT(5.0);
        assertEquals(6.928515211949898e-17, result, 0.01);
        assertEquals(exception, DeltaT.estimate(forDate));
    }

}