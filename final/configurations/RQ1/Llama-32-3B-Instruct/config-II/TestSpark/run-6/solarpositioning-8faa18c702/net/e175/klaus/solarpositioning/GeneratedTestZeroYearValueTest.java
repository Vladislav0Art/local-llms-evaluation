package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

public class GeneratedTestZeroYearValueTest {

    @Test
    public void testZeroYearValueTest() {
        assertEquals(8.83 + 0.1603 * 0 - 0.01532 * pow(0, 2) + pow(0, 3) / 7129, DeltaT.estimate(LocalDate.of(1800, 12, 31)));
    }

}