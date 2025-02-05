package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;
import org.junit.Assert;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPositionLatitudeWithMinValueTest {

    @Test
    public void calculateSolarPositionLatitudeWithMinValueTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneId.of("UTC"));
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, -90, 0, 0);
        Assert.assertNotNull(result);
    }

}