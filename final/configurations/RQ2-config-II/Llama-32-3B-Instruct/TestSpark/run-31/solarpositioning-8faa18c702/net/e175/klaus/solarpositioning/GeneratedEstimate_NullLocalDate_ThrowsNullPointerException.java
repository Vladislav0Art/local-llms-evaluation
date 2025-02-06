package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_NullLocalDate_ThrowsNullPointerException {

    @Mock
    private Optional<LocalDate> forDateMock;

    @Test
    public void estimate_NullLocalDate_ThrowsNullPointerException() {
        when(forDateMock.get()).thenReturn(null);
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(forDateMock.get()));
    }

}