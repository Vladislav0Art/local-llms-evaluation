package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import static org.mockito.Mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import java.util.List;

import net.e175.klaus.solarpositioning.exceptions.SolarPositioningException;

public class GeneratedTestEstimate_SolarPositioningException {

    @Test
    public void testEstimate_SolarPositioningException() {
        // Arrange
        LocalDate forDate = LocalDate.of(2023, 1, 15);
        when(new DeltaT().estimate(forDate)).thenThrow(SolarPositioningException.class);

        // Act and Assert
        assert throwsExactlyOnce(() -> new SolarPositioningException());
    }

}