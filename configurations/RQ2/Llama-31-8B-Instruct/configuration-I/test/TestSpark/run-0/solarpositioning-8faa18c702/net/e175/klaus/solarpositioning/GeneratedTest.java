package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void estimate_WithValidDate_ReturnsCorrectValue() {
        // Arrange
        LocalDate forDate = LocalDate.of(2022, 1, 1);

        // Act
        double result = DeltaT.estimate(forDate);

        // Assert
        assertEquals(0.0, result, 0.0);
    }

    @Test
    public void estimate_WithNullDate_ThrowsNullPointerException() {
        // Act and Assert
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(null));
    }

    @Test
    public void estimate_WithEmptyDate_ThrowsNullPointerException() {
        // Act and Assert
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(LocalDate.MIN));
    }

    @Test
    public void estimate_WithMaxDate_ThrowsNullPointerException() {
        // Act and Assert
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(LocalDate.MAX));
    }

}