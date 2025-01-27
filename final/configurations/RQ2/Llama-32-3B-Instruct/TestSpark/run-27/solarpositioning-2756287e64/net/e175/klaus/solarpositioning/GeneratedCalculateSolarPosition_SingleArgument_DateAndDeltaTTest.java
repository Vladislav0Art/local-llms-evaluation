package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class GeneratedCalculateSolarPosition_SingleArgument_DateAndDeltaTTest {

    @Test
    public void calculateSolarPosition_SingleArgument_DateAndDeltaTTest() {
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0, 0, ZoneOffset.UTC);
        double deltaT = 10.0;
        AzimuthZenithAngle result = Grena3.calculateSolarPosition(date, deltaT);
        assertNotNull(result);
    }

}