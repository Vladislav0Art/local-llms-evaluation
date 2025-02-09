package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class GeneratedEstimate_DeltaTWasZeroOnPreviousDay {

    public static final double SOLSTA_SYST = 0;
    public static final double DELTA_T_WAS_ZERO_ON_PREVIOUS_DAY = -1;
    public static final double SOLSTA_SYST_MINUS_THREE = -3;

    public static double estimate(final LocalDate forDate) {
        // implementation
        return 0;
    }
}

public class DeltaT_test {

    @Test
    public void estimate_DeltaTWasZeroOnPreviousDay() {
        LocalDate previousDate = LocalDate.now().minusDays(1);
        assertEquals(DeltaT.DELTA_T_WAS_ZERO_ON_PREVIOUS_DAY, -1);
        assertEquals(DeltaT.estimate(previousDate), -1);
    }

}