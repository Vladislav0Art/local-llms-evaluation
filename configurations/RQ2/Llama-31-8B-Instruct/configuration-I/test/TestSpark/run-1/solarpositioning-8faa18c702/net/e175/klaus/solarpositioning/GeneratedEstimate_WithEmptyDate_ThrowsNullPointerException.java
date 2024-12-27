package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_WithEmptyDate_ThrowsNullPointerException {

    @Test
    public void estimate_WithEmptyDate_ThrowsNullPointerException() {
        // Act and Assert
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(LocalDate.MIN));
    }

}