package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate DifferentDaysFromEpoch_ThrowsUnsupportedOperationException {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimate

    DifferentDaysFromEpoch_ThrowsUnsupportedOperationException() {
        // given
        when(forDate.toLocalDate()).thenReturn(LocalDate.now().plusDays(1));

        // when and then
        assertThrows(UnsupportedOperationException.class, () -> DeltaT.estimate(forDate));
    }

}