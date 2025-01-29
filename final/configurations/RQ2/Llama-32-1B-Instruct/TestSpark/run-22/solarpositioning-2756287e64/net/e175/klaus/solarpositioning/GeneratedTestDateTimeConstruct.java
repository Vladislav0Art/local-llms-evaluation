package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestDateTimeConstruct {

    @Test
    public void testDateTimeConstruct() {
        DateTime date = new DateTime(2022, 6, 1);
        assertEquals(2022, date.year);
        assertEquals(6, date.month);
        assertEquals(1, date.dayOfMonth);

        date.setMonth(7);
        assertEquals(2023, date.year);
        assertEquals(8, date.month);
        assertEquals(1, date.dayOfMonth);
    }

}