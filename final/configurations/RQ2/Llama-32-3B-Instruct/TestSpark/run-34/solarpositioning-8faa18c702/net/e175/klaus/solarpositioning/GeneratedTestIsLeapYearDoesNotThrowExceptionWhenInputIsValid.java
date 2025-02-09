package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedTestIsLeapYearDoesNotThrowExceptionWhenInputIsValid {

    @Test
    public void testIsLeapYearDoesNotThrowExceptionWhenInputIsValid() {
        assertTrue(DeltaT.isLeapYear(LocalDate.of(2020, 2, 29)));
    }

}