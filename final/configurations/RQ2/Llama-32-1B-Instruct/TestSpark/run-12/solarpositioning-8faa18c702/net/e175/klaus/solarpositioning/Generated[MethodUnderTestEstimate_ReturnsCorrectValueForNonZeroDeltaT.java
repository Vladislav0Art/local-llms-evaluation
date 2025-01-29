package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

public class Generated[

MethodUnderTestEstimate_ReturnsCorrectValueForNonZeroDeltaT {

    @Mock
    private LocalDate mockDate;

    @InjectMocks
    private DeltaT deltaT;

    @Test
    public void [MethodUnderTestEstimate_ReturnsCorrectValueForNonZeroDeltaT() {
        // Arrange
        LocalDate forDate = LocalDate.of(2022, 1, 1);
        double result = 10000;
        when(mockDate.toEpochDay()).thenReturn(0);

        // Act and Assert
        assertEquals(result, deltaT.estimate(forDate), 0.01);
    }

}