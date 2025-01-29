package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import net.e175.klaus.solarpositioning.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedTestEstimateForValidDate_NoException_throwsIllegalArgumentException {

    @Test
    public void testEstimateForValidDate_NoException_throwsIllegalArgumentException() {
        LocalDate forDate = LocalDate.now();
        double result = TestUtils.mockDeltaT(1.0);
        assertEquals(2.23606797749979e-16, result, 0.01);
        assertEquals(exception, DeltaT.estimate(forDate));
    }

}