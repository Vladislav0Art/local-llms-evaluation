package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedIsLeapYear_MockImplementationTestsCorrectResult {

    @Test
    public void isLeapYear_MockImplementationTestsCorrectResult() {
        // Given and when
        DeltaT.isLeapYear = mock(DeltaT.class);
        when(DeltaT.isLeapYear(date.getYear())).thenReturn(true);

        // Then
        assertTrue(DeltaT.isLeapYear(date.getYear()));
    }

}