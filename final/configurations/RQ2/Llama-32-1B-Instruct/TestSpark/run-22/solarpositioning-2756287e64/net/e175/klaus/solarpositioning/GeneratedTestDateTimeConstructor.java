package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestDateTimeConstructor {

    @Test
    public void testDateTimeConstructor() {
        DateTime date = new DateTime(0, 12, 31); // invalid date (before January)
        assertEquals(Integer.MIN_VALUE, date.year);

        date = new DateTime(-1, -1, -1); // invalid date (- before December)
        assertEquals(Integer.MAX_VALUE, date.year);
    }

}