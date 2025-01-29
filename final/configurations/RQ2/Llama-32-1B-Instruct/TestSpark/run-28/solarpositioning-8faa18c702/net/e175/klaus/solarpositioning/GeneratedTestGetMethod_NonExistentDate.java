package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestGetMethod_NonExistentDate {

    @BeforeEach
    void setup() {
        // Arrange
        LocalDate date = LocalDate.of(2022, 12, 31);
        Double[] results1 = {0.000001, 0.003199981};
        Double[] results2 = {0, 0};

        when(DeltaT.class.getClassLoader()).thenReturn("path/toClassLoader");
    }

    @Test
    public void testGetMethod_NonExistentDate() {
        // Act and Assert
        try {
            new DeltaT();
        } catch (Exception e) {
            assertEquals("java.lang.NullPointerException", e.getMessage());
        }
    }

}