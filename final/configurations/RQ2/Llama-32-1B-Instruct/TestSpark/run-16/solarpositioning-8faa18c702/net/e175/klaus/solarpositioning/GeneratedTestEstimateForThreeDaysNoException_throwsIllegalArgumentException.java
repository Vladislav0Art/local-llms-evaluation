package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import net.e175.klaus.solarpositioning.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedTestEstimateForThreeDaysNoException_throwsIllegalArgumentException {

    @Test
    public void testEstimateForThreeDaysNoException_throwsIllegalArgumentException() {
        LocalDate forDate = LocalDate.now();
        double result = TestUtils.mockDeltaT(3.0);
        assertEquals(5.196152422706632e-16, result, 0.01);
        assertEquals(exception, DeltaT.estimate(forDate));
    }

}