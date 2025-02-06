package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedIsLeapYear_ReturnsTrueForCorrectYear {

    @Test
    public void isLeapYear_ReturnsTrueForCorrectYear() {
        boolean result = DeltaT.isLeapYear(2022);
        assertTrue("Leap year not identified correctly", result);
    }

}