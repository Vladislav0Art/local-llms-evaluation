package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalcT_LeapDayTest {

    @Test
    public void calcT_LeapDayTest() {
        ZonedDateTime date = ZonedDateTime.now().withDayOfMonth(29);
        double t = Grena3.calcT(date);
        assertEquals(365.25 * (date.getYear() - 2000) + (30.6001 * (date.getMonthValue()) + 1)
                - (0.01 * date.getYear()) + date.getDayOfMonth() + date.getHour()
                / 24d + date.getMinute() / 60d + date.getSecond() / (60d * 60), t);
    }

}