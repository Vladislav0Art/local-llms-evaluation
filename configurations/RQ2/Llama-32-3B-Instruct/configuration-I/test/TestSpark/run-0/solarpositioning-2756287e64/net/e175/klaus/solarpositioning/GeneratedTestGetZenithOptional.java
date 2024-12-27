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

public class GeneratedTestGetZenithOptional {

    @Mock
    private AzimuthZenithAngle azimuthZenithAngle;

    @Test
    public void testGetZenithOptional() {
        String zenith = "S";
        Optional<Double> zenithOptional = getZenithOptional(zenith);
        assert zenithOptional.isPresent();
        assertEquals("S", zenithOptional.get());
    }
}

class Grena3 {
    public ZonedDateTime date;

    public double latitude;
    public double longitude;
    public double deltaT;

    public Optional<Double> result;

    public Optional<Double> getAzimuthOptional(String azimuth) {
        return Optional.of(azimuth);
    }

    public Optional<Double> getZenithOptional(String zenith) {
        return Optional.of(zenith);
    }

    public void calculateSolarPosition(ZonedDateTime date, double latitude, double longitude, double deltaT) {
        this.date = date;
        this.latitude = latitude;
        this.longitude = longitude;
        this.deltaT = deltaT;

        Optional<Double> azimuthOptional = getAzimuthOptional("N");
        Optional<Double> zenithOptional = getZenithOptional("S");

        if (azimuthOptional.isPresent()) {
            result = Optional.of(45.0);
        } else {
            result = Optional.empty();
        }
    }
}

class AzimuthZenithAngle {
    public String azimuth;
    public String zenith;

    public String getAzimuth() {
        return azimuth;
    }

    public String getZenith() {
        return zenith;
    }

}