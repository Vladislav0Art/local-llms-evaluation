package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

public class Generated[

MethodUnderTestEstimate_ReturnsZeroWhenNoData {

    @Mock
    private LocalDate mockDate;

    @InjectMocks
    private DeltaT deltaT;

    @Test
    public void [MethodUnderTestEstimate_ReturnsZeroWhenNoData() {
        // Arrange
        LocalDate forDate = null;
        double result = 0;

        // Act and Assert
        assertEquals(result, deltaT.estimate(forDate), 0.01);
    }

}