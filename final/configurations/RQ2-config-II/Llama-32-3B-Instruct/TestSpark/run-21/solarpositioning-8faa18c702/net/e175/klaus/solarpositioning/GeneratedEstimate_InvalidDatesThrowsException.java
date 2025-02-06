package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_InvalidDatesThrowsException {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimate_InvalidDatesThrowsException() {
        when(forDate.atDay(61)).thenThrow(NullPointerException::new);
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(forDate));
    }

}