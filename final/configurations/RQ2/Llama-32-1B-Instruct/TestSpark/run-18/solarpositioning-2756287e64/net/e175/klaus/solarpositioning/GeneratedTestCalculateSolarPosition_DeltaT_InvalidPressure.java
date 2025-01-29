package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GeneratedTestCalculateSolarPosition_DeltaT_InvalidPressure {

    private final Grena3 grena3 = new Grena3();

    @BeforeEach
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCalculateSolarPosition_DeltaT_InvalidPressure() throws Exception {
        // Arrange
        double latitude = 40.7128;
        ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 0, 0);
        Mockito.when(grena3.calculateSolarPosition(date, latitude, -80.0060, 10)).thenReturn(new AzimuthZenithAngle());
        Mockito.when(grena3.calculateSolarPosition(date.plusDays(-100), latitude, -74.0060, 20)).thenReturn(new AzimuthZenithAngle());

        // Act
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, latitude, -80.0060, 10);

        // Assert
        assert result.getAzimuth() == 0;
    }

}