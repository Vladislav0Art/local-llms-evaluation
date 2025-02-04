package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCalcT_ReturnsCorrectTimeValue_Test {

    @Test
    public void calcT_ReturnsCorrectTimeValue_Test() {
        ZonedDateTime date = ZonedDateTime.now();
        double time = Grena3.calcT(date);

        assertEquals(365.25 * (date.getYear() - 2000) + 30.6001 * (date.getMonthValue() + 1), time, 0.00001);
    }

}