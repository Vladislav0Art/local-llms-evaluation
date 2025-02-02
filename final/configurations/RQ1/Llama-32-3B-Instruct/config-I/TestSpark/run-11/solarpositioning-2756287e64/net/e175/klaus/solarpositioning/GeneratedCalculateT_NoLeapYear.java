package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateT_NoLeapYear {

    @Test
    public void calculateT_NoLeapYear() {
        ZonedDateTime date = ZonedDateTime.now().withYear(2022).withMonth(12).withDayOfMonth(30).withHour(0).withMinute(0).withSecond(0);
        double result = Grena3.calcT(date);
        assertTrue(result == 364.03);
    }

}