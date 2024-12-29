package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import static org.mockito.Mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import java.util.List;

import net.e175.klaus.solarpositioning.exceptions.SolarPositioningException;

public class GeneratedTest {

    @Test
    public void testEstimate_SimpleCase() {
        // Arrange
        LocalDate forDate = LocalDate.of(2023, 1, 15);
        List<LocalDate> dates = List.of(forDate);

        // Act
        double result = new DeltaT().estimate(forDate);

        // Assert
        assert result == 10.0; // Assuming a constant power law of 10 for simplicity
    }

    @Test
    public void testEstimate_SlightlyDifferentDates() {
        // Arrange
        LocalDate forDate1 = LocalDate.of(2023, 1, 15);
        LocalDate forDate2 = LocalDate.of(2023, 1, 16);
        List<LocalDate> dates = List.of(forDate1, forDate2);

        // Act
        double result = new DeltaT().estimate(forDate1);

        // Assert
        assert result == -0.5; // Assuming a constant power law of 10/9 for simplicity
    }

    @Test
    public void testEstimate_SimultaneousDates() {
        // Arrange
        LocalDate forDate = LocalDate.of(2023, 1, 15);
        List<LocalDate> dates = List.of(forDate);

        // Act
        double result = new DeltaT().estimate(forDate);

        // Assert
        assert result == -2.5; // Assuming a constant power law of 10/11 for simplicity
    }

    @Test
    public void testEstimate_SolarPositioningException() {
        // Arrange
        LocalDate forDate = LocalDate.of(2023, 1, 15);
        when(new DeltaT().estimate(forDate)).thenThrow(SolarPositioningException.class);

        // Act and Assert
        assert throwsExactlyOnce(() -> new SolarPositioningException());
    }

    @Test
    public void testEstimate_InvalidParameter() {
        // Arrange
        LocalDate forDate = LocalDate.of(2023, 1, 15);
        String parameter = " invalid value";

        // Act and Assert
        assert throwsExactlyOnce(() -> new DeltaT().estimate(forDate));
    }

    private void assertThrowsExactlyOnce(Supplier<Exception> supplier) {
        verify(supplier).get();
        verifyNoMoreInteractions(supplier);
    }

}