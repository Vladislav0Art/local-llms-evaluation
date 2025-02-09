package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_ThrowsExceptionForInvalidDate {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimate_ThrowsExceptionForInvalidDate() {
        when(forDate.toInstant()).thenReturn(-1L);
        assertThrows(Exception.class, () -> DeltaT.estimate(forDate));
    }

}