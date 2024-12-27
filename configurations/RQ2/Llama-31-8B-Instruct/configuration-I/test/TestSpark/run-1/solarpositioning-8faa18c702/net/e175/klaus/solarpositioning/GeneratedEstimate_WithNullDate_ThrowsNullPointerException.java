package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_WithNullDate_ThrowsNullPointerException {

    @Test
    public void estimate_WithNullDate_ThrowsNullPointerException() {
        // Act and Assert
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(null));
    }

}