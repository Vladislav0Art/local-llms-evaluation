package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.ZonedDateTime;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPositionDate_LatitudeLongitudeDeltaTZenithAngleTest {

    @Mock
    private ZonedDateTime date;

    @Mock
    private double latitude;

    @Mock
    private double longitude;

    @Mock
    private double deltaT;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    public static Optional<String> getAzimuthOptional(String azimuth) {
        return Optional.ofNullable(azimuth);
    }

    public static Optional<String> getZenithOptional(String zenith) {
        return Optional.ofNullable(zenith);
    }

    @Test
    public void calculateSolarPositionDate_LatitudeLongitudeDeltaTZenithAngleTest() {
        AzimuthZenithAngle result = new AzimuthZenithAngle();
        when(date.toInstant()).thenReturn(1L);
        when(latitude).thenReturn(45.0);
        when(longitude).thenReturn(-10.0);
        when(deltaT).thenReturn(2.0);
        Grena3.calculateSolarPosition(date, latitude, longitude, deltaT, result);
    }

}