package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.never;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimateValidDateTest {

    @Test
    public void estimateValidDateTest() {
        // Arrange
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        DeltaT deltaT = new DeltaT();

        // Act
        double result = deltaT.estimate(forDate);

        // Assert
        assertEquals(0.0, result, 0.0);
    }

}