package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import static org.mockito.Mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import java.util.List;

import net.e175.klaus.solarpositioning.exceptions.SolarPositioningException;

public class GeneratedTestEstimate_InvalidParameter {

    @Test
    public void testEstimate_InvalidParameter() {
        // Arrange
        LocalDate forDate = LocalDate.of(2023, 1, 15);
        String parameter = " invalid value";

        // Act and Assert
        assert throwsExactlyOnce(() -> new DeltaT().estimate(forDate));
    }

    private void assertThrowsExactlyOnce(Supplier<Exception> supplier) {
        verify(supplier).get();
        verifyNoMoreInteractions(supplier);
    }

}