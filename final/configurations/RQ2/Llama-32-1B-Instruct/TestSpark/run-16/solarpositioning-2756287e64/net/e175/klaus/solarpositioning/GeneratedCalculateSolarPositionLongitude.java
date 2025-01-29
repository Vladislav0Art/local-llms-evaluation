package net.e175.klaus.solarpositioning;

import com.github.javaparser.ast.body.MethodDeclaration;
import org.junit.Test;

public class GeneratedCalculateSolarPositionLongitude {

    private final Grena3 G
    Rena3 =new

    Grena3();

    @Test
    public void calculateSolarPositionLongitude() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2024, 3, 21, 14, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5202;
        double longitude = -13.4058;

        // Act and Assert
        AzimuthZenithAngle result = G Rena3.calculateSolarPosition(date, latitude, longitude, 0);

        // Assertions
        assertEquals(315.0001, result.getAzimuth(), 0.01);
    }

}