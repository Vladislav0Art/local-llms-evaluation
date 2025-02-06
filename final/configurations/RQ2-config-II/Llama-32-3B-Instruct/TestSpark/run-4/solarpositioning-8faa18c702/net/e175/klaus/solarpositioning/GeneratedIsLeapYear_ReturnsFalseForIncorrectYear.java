package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedIsLeapYear_ReturnsFalseForIncorrectYear {

    @Test
    public void isLeapYear_ReturnsFalseForIncorrectYear() {
        boolean result = DeltaT.isLeapYear(2021);
        assertFalse("Leap year incorrectly identified as true", result);
    }
}

}