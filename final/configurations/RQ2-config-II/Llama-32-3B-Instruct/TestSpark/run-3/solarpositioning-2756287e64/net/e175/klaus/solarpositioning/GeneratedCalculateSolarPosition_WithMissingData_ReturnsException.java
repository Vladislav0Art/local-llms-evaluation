package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.OptionalDouble;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedCalculateSolarPosition_WithMissingData_ReturnsException {

    @Mock
    private OptionalDouble doubleValue;

    @Test
    public void calculateSolarPosition_WithMissingData_ReturnsException() {
        // given
        ZonedDateTime date = ZonedDateTime.now(ZoneOffset.UTC);
        double latitude = 48.8566;
        double longitude = 2.3522;
        double deltaT = 0;

        // when
        AzimuthZenithAngle angle = Grena3.calculateSolarPosition(date, latitude, longitude, deltaT);

        // then
        assertNotNull(angle);
    }

}