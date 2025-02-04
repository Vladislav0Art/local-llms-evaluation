package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

public class GeneratedTestNegativeYearValuesTest {

    @Test
    public void testNegativeYearValuesTest() {
        assertEquals(-20 + 32 * pow((-50) / 100, 2), DeltaT.estimate(LocalDate.of(1800, 1, 1)));
        assertEquals(8.83 + 0.1603 * (-50) - 0.01532 * pow((-50), 2) + pow(-50, 3) / 7129, DeltaT.estimate(LocalDate.of(1800, 6, 30)));
    }

}