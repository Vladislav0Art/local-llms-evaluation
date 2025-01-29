package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import net.e175.klaus.solarpositioning.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedTestEstimateForFourDaysNoException_throwsIllegalArgumentException {

    @Test
    public void testEstimateForFourDaysNoException_throwsIllegalArgumentException() {
        LocalDate forDate = LocalDate.now();
        double result = TestUtils.mockDeltaT(4.0);
        assertEquals(5.972383494949296e-16, result, 0.01);
        assertEquals(exception, DeltaT.estimate(forDate));
    }

}