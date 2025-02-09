package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.Grena3;
import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertNotNull;

public class GeneratedCalculateSolarPositionNullDateFourParamsTest {

    @Test
    public void calculateSolarPositionNullDateFourParamsTest() {
        ZonedDateTime date = null;
        double latitude = Mockito.mock(Double.class);
        double longitude = Mockito.mock(Double.class);
        double deltaT = Mockito.mock(Double.class);

        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);
    }

}