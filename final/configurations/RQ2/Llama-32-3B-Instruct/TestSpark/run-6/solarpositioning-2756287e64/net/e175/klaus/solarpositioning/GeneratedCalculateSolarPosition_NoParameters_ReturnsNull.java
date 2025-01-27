package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import static java.lang.Math.*;

public class GeneratedCalculateSolarPosition_NoParameters_ReturnsNull {

    @Test
    public void calculateSolarPosition_NoParameters_ReturnsNull() {
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(null, null, null, null);
        assertThat(result, nullValue());
    }

}