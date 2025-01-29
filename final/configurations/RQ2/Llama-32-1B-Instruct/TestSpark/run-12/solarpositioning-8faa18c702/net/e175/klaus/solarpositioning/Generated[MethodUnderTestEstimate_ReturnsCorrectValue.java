package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

public class Generated[

MethodUnderTestEstimate_ReturnsCorrectValue {

    @Mock
    private LocalDate mockDate;

    @InjectMocks
    private DeltaT deltaT;

    @Test
    public void [MethodUnderTestEstimate_ReturnsCorrectValue() {
        // Arrange
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        double result = 0.000001;
        when(mockDate.toEpochDay()).thenReturn(2451545);

        // Act and Assert
        assertEquals(result, deltaT.estimate(forDate), 0.01);
    }

}