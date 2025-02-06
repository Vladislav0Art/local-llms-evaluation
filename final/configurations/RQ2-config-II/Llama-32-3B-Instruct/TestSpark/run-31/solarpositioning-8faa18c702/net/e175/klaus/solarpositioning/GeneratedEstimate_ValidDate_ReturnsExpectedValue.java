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
public class GeneratedEstimate_ValidDate_ReturnsExpectedValue {

    @Mock
    private Optional<LocalDate> forDateMock;

    @Test
    public void estimate_ValidDate_ReturnsExpectedValue() {
        when(forDateMock.get()).thenReturn(LocalDate.of(2022, 12, 31));
        double result = DeltaT.estimate(forDateMock.get());
        assertEquals(0.5, result, 1e-9);
    }

}