package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedCalculateSolarPositionWithMockedZonedDateTimeTest {

    @Test
    public void calculateSolarPositionWithMockedZonedDateTimeTest() {
        ZonedDateTime dateTime = Mockito.mock(ZonedDateTime.class);
        when(dateTime.toInstant()).thenReturn(ZonedDateTime.now(ZoneOffset.UTC).toInstant());
        when(dateTime.getZone()).thenReturn(ZoneOffset.UTC);
        double latitude = 35.6895;
        double longitude = 139.6917;
        double deltaT = 69.0;

        AzimuthZenithAngle result = Grena3.calculateSolarPosition(dateTime, latitude, longitude, deltaT);

        // You will replace these assertions with the correct ones based on the implementation.
        // These are placeholders since the implementation is not available here.
        assertEquals(0, result.getAzimuth(), 0.00);
        assertEquals(0, result.getZenithAngle(), 0.00);
    }

}