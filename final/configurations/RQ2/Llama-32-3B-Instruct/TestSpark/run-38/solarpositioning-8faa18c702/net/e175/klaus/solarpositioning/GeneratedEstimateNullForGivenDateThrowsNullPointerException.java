package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import java.time.LocalDate;

import net.e175.klaus.solarpositioning.DeltaT;
import net.e175.klaus.solarpositioning.DeltaTStub;
import net.e175.klaus.solarpositioning.SunLocation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimateNullForGivenDateThrowsNullPointerException {

    @Test
    public void estimateNullForGivenDateThrowsNullPointerException() {
        // Given
        LocalDate forDate = null;

        // When and Then
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(forDate));
    }

}