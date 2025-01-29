package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.when;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Arrays;

public class GeneratedCalculateSolarPosition_DeltaTime_0 {

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
    public void calculateSolarPosition_DeltaTime_0() {
        // Arrange
        MockGrena3 mockGrena3 = new MockGrena3();
        mockGrena3.whenDateHasBeenSet();
        mockGrena3.whenLatitudeHasBeenSet(42.1);
        mockGrena3.whenLongitudeHasBeenSet(37.4);
        mockGrena3.whenDeltaTHasBeenSet(0.0);

        // Act
        double result = Grena3.calculateSolarPosition(mockGrena3.date, mockGrena3.latitude, mockGrena3.longitude, mockG Rena3.deltaT);

        // Assert
        verify(Grena3.class).calculateSolarPosition(mockGrena3.date, mockGrena3.latitude, mockGrena3.longitude);
    }

}