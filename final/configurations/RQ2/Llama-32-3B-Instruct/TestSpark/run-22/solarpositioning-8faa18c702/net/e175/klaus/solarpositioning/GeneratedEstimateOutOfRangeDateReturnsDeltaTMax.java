package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

public class GeneratedEstimateOutOfRangeDateReturnsDeltaTMax {

    @Test
    public void estimateOutOfRangeDateReturnsDeltaTMax() {
        LocalDate date = LocalDate.of(2022, 12, 31); // Last day of December
        assertEquals(DeltaT.DELTA_T_MAX, DeltaT.estimate(date), 0.001);
    }
}

}