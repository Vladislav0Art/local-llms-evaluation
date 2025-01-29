package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import net.e175.klaus.solarpositioning.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedTestEstimateForTwoDaysNoException_throwsIllegalArgumentException {

    @Test
    public void testEstimateForTwoDaysNoException_throwsIllegalArgumentException() {
        LocalDate forDate = LocalDate.now();
        double result = TestUtils.mockDeltaT(2.0);
        assertEquals(3.4641016154549017e-16, result, 0.01);
        assertEquals(exception, DeltaT.estimate(forDate));
    }

}