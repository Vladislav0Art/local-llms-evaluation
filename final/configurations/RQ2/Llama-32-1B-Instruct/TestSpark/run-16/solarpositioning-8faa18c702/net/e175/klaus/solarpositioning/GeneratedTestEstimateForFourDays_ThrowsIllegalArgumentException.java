package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import net.e175.klaus.solarpositioning.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class GeneratedTestEstimateForFourDays_ThrowsIllegalArgumentException {

    @Test
    public void testEstimateForFourDays_ThrowsIllegalArgumentException() {
        LocalDate forDate = LocalDate.now();
        IllegalArgumentException exception = new IllegalArgumentException("Invalid date");
        assertEquals(exception, DeltaT.estimate(forDate));
    }

}