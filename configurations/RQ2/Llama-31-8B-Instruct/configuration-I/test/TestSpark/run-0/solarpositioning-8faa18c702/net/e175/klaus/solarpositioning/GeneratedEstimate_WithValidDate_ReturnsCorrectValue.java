package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_WithValidDate_ReturnsCorrectValue {

    @Test
    public void estimate_WithValidDate_ReturnsCorrectValue() {
        // Arrange
        LocalDate forDate = LocalDate.of(2022, 1, 1);

        // Act
        double result = DeltaT.estimate(forDate);

        // Assert
        assertEquals(0.0, result, 0.0);
    }

}