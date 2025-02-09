package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.LocalDate;

public class GeneratedTestIsLeapYearThrowsExceptionForInvalidInput {

    @Test
    public void testIsLeapYearThrowsExceptionForInvalidInput() {
        assertFalse(DeltaT.isLeapYear(LocalDate.of(2020, 1, 31)));
    }

}