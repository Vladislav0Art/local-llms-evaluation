package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestEstimate_NoPositionData {

    @BeforeEach
    void setup() {
        // Arrange
        LocalDate date = LocalDate.of(2022, 12, 31);
        Double[] results1 = {0.000001, 0.003199981};
        Double[] results2 = {0, 0};

        when(DeltaT.class.getClassLoader()).thenReturn("path/toClassLoader");
    }

    @Test
    public void testEstimate_NoPositionData() {
        // Act
        DeltaT deltaT = new DeltaT();
        double result = deltaT.estimate(date);

        // Assert
        assertEquals(0, result);
    }

}