package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.ZoneOffset;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedCalculateSolarPositionWithWrongDeltaTTest {

    @Test
    public void calculateSolarPositionWithWrongDeltaTTest() {
        ZonedDateTime date = ZonedDateTime.of(2020, 1, 1, 12, 0, 0, 0, ZoneId.of("UTC"));
        Grena3.calculateSolarPosition(date, 35.6895, 139.6917, -1);
    }

}