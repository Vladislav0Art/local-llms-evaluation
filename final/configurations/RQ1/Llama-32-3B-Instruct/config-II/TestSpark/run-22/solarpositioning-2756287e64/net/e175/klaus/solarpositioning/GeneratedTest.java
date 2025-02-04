package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void calculateSolarPosition_SingleParameterTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 52.5200;
        double longitude = 13.4050;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);
        assertEquals(181.94, result.getAzimuth(), 0.01);
    }

    @Test
    public void calculateSolarPosition_TwoParameterTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double latitude = 52.5200;
        double longitude = 13.4050;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, latitude, longitude);
        assertEquals(181.94, result.getAzimuth(), 0.01);
    }

    @Test
    public void calculateSolarPosition_ThreeParameterTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double pressure = 101325;
        double temperature = 293.15;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 52.5200, 13.4050, pressure, temperature);
        assertEquals(181.94, result.getAzimuth(), 0.01);
    }

    @Test
    public void calcT_ExactDateTest() {
        ZonedDateTime date = ZonedDateTime.now();
        double t = Grena3.calcT(date);
        assertEquals(365.25 * (date.getYear() - 2000) + (30.6001 * (date.getMonthValue()) + 1)
                - (0.01 * date.getYear()) + date.getDayOfMonth() + date.getHour()
                / 24d + date.getMinute() / 60d + date.getSecond() / (60d * 60), t);
    }

    @Test
    public void calcT_LeapDayTest() {
        ZonedDateTime date = ZonedDateTime.now().withDayOfMonth(29);
        double t = Grena3.calcT(date);
        assertEquals(365.25 * (date.getYear() - 2000) + (30.6001 * (date.getMonthValue()) + 1)
                - (0.01 * date.getYear()) + date.getDayOfMonth() + date.getHour()
                / 24d + date.getMinute() / 60d + date.getSecond() / (60d * 60), t);
    }

}