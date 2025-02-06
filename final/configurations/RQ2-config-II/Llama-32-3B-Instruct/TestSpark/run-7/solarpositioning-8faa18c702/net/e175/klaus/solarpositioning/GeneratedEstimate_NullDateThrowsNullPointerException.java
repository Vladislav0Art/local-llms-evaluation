package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_NullDateThrowsNullPointerException {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimate_NullDateThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(null));
    }

}