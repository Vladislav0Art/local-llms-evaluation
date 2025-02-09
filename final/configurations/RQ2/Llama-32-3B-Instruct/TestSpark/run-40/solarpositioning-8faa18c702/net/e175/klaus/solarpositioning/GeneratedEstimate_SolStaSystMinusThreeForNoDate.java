package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;
import java.time.LocalDate;

public class GeneratedEstimate_SolStaSystMinusThreeForNoDate {

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
    public void estimate_SolStaSystMinusThreeForNoDate() {
        LocalDate noDate = LocalDate.of(1970, 9, 1);
        assertEquals(DeltaT.SOLSTA_SYST_MINUS_THREE, -3);
        assertEquals(DeltaT.estimate(noDate), -3);
    }

}