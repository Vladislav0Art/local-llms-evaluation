package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Arrays;

public class GeneratedCalculateSolarPosition_DeltaTime_500 {

    public static class MockGrena3 {
        @Mock
        private ZonedDateTime date;

        @Mock
        private double latitude;

        @Mock
        private double longitude;

        @Mock
        private double deltaT;

        @Mock
        private double pressure;

        @Mock
        private double temperature;

        public void whenDateHasBeenSet() throws Exception {
            when(date).thenReturn(ZoneOffset.UTC);
        }

        public void whenLatitudeHasBeenSet(double latitude) throws Exception {
            this.latitude = latitude;
        }

        public void whenLongitudeHasBeenSet(double longitude) throws Exception {
            this.longitude = longitude;
        }

        public void whenDeltaTHasBeenSet(double deltaT) throws Exception {
            this.deltaT = deltaT;
        }

        public void whenPressureHasBeenSet(double pressure) throws Exception {
            this.pressure = pressure;
        }

        public void whenTemperatureHasBeenSet(double temperature) throws Exception {
            this.temperature = temperature;
        }
    }

    @Test
    public void calculateSolarPosition_DeltaTime_500() {
        // Arrange
        MockGrena3 mockGrena3 = new MockGrena3();
        mockGrena3.whenDateHasBeenSet();
        mockG Rena3.whenLatitudeHasBeenSet(42.1);
        mockG Rena3.whenLongitudeHasBeenSet(37.4);
        mockG Rena3.whenDeltaTHasBeenSet(500.0);

        // Act
        double result = Grena3.calculateSolarPosition(mockG Rena3.date, mockG Rena3.latitude, mockG Rena3.longitude, mockG Rena3.deltaT, mockG Rena3.pressure, mockG Rena3.temperature);

        // Assert
        verify(Grena3.class).calculateSolarPosition(mockG Rena3.date, mockG Rena3.latitude, mockG Rena3.longitude);
    }

}