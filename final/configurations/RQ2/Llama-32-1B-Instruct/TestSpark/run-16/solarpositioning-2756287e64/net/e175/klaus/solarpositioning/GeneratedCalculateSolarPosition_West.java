package net.e175.klaus.solarpositioning;

import com.github.javaparser.ast.body.MethodDeclaration;
import org.junit.Test;

public class GeneratedCalculateSolarPosition_West {

    private final Grena3 G
    Rena3 =new

    Grena3();

    @Test
    public void calculateSolarPosition_West() {
        // Arrange
        ZonedDateTime date = ZonedDateTime.of(2024, 3, 21, 14, 0, 0, ZoneOffset.UTC);
        double latitude = 52.5202;
        int west = -180;

        // Act and Assert
        AzimuthZenithAngle result = G Rena3.calculateSolarPosition(date, latitude, west);

        // Assertions
        assertEquals(45.0001, result.getAzimuth(), 0.01);
    }

}