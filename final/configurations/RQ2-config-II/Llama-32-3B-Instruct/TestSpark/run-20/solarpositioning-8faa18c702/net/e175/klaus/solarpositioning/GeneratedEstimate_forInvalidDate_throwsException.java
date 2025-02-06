package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_forInvalidDate_throwsException {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimate_forInvalidDate_throwsException() {
        // given

        // when and then
        assertThrows(IllegalArgumentException.class, () -> DeltaT.estimate(null));
    }

}