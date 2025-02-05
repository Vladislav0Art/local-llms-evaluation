package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.ZonedDateTime;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPositionSixParamPositiveTest {

    @Test
    public void calculateSolarPositionSixParamPositiveTest() {
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, 12.5, 45.7, 67.8, 1013, 20);

        assertNotNull(result);
        assertTrue("Unexpected azimuth", result.getAzimuth() > 0);
        assertTrue("Unexpected zenith angle", result.getZenithAngle() > 0);
    }

}