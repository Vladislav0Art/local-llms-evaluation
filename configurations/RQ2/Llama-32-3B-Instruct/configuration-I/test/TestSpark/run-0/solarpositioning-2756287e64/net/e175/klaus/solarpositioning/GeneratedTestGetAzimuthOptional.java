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

public class GeneratedTestGetAzimuthOptional {

    @Mock
    private AzimuthZenithAngle azimuthZenithAngle;

    @Test
    public void testGetAzimuthOptional() {
        String azimuth = "N";
        Optional<Double> azimuthOptional = getAzimuthOptional(azimuth);
        assert azimuthOptional.isPresent();
        assertEquals("N", azimuthOptional.get());
    }

}