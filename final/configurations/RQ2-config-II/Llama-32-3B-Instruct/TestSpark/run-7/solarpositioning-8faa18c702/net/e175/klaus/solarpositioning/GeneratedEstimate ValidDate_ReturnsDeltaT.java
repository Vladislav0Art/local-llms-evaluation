package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate ValidDate_ReturnsDeltaT {

    @Mock
    private LocalDate forDate;

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

}