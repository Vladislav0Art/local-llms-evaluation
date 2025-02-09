package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedEstimate_NonExistentDate_ThrowsException {

    @Test
    public void estimate_NonExistentDate_ThrowsException() {
        try {
            DeltaT.estimate(LocalDate.of(-1, 1, 1));
            assert false;
        } catch (IllegalArgumentException e) {
            assertEquals("No valid delta T for the given date.", e.getMessage());
        }
    }

}