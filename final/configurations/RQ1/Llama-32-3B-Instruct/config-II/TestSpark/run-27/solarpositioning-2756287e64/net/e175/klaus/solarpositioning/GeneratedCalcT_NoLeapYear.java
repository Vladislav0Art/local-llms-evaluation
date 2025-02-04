package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalcT_NoLeapYear {

    @Test
    public void calcT_NoLeapYear() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);

        double t = Grena3.calcT(date);

        assertEquals(2440587.5, t, 0.01);
    }

}