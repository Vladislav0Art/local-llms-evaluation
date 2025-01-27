package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_Atomically_ThrowsException_WrongParametersNoDeltaT {

    @Test
    public void calculateSolarPosition_Atomically_ThrowsException_WrongParametersNoDeltaT() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
        double latitude = -45.0;
        double longitude = -120.0;
        assertThrows(ArithmeticException.class, () -> Grena3.calculateSolarPosition(date, latitude, longitude));
    }

}