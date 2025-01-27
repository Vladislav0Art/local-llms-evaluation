package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyDouble;

public class GeneratedIsSameLeapYearTest {

    @Test
    public void isSameLeapYearTest() {
        assertTrue(DeltaT.isSameLeapYear(LocalDate.of(2024, 2, 29)));
    }

}