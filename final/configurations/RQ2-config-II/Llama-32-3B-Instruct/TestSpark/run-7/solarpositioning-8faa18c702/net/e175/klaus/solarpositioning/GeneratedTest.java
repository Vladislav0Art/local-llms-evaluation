package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimate_NullDateThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(null));
    }

    @Test
    public void estimate

    ValidDate_ReturnsDeltaT() {
        // given
        when(forDate.toLocalDate()).thenReturn(LocalDate.now());

        // when
        double result = DeltaT.estimate(forDate);

        // then
        assertNotNull(result);
    }

    @Test
    public void estimate

    InvalidDate_ReturnsInfinity() {
        // given
        when(forDate.isLeapDay()).thenReturn(true);

        // when
        double result = DeltaT.estimate(forDate);

        // then
        assertTrue(Double.isInfinite(result));
    }

    @Test
    public void estimate

    DifferentDaysFromEpoch_ThrowsUnsupportedOperationException() {
        // given
        when(forDate.toLocalDate()).thenReturn(LocalDate.now().plusDays(1));

        // when and then
        assertThrows(UnsupportedOperationException.class, () -> DeltaT.estimate(forDate));
    }

}