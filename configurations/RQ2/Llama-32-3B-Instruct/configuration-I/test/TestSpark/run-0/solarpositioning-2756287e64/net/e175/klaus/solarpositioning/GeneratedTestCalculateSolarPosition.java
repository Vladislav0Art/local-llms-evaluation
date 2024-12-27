package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitExtension;

import java.time.Instant;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;

import java.time.ZonedDateTime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.when;

public class GeneratedTestCalculateSolarPosition {

    @Mock
    private AzimuthZenithAngle azimuthZenithAngle;

    @Test
    public void testCalculateSolarPosition() {
        Instant instant = Instant.now();
        when(date.toInstant()).thenReturn(instant);
        double latitude = 37.7749;
        double longitude = -122.4194;
        double deltaT = 10.0;
        Optional<Double> result = Optional.of(45.0);
        Grena3 grena3 = new Grena3();
        grena3.calculateSolarPosition(date, latitude, longitude, deltaT, result);
    }

}