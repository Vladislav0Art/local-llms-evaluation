package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Collections;

public class GeneratedEstimate_DeltaT_MidnightUTCOnSummerSolsticeTest {

    public static double estimate(final LocalDate forDate) {
        return 0.0; // Implementation goes here
    }

}

package net.e175.klaus.solarpositioning;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.time.LocalDate;
import java.util.Collections;

public class GeneratedTest {

    @Test
    public void estimate_DeltaT_MidnightUTCOnSummerSolsticeTest() {
        LocalDate forDate = LocalDate.of(2022, 6, 21);
        assertEquals(-0.0027277777777777777, DeltaT.estimate(forDate), 1e-8);
    }

}