package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Collections;

public class GeneratedEstimate_DeltaT_GregorianLeapDayTest {

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
    public void estimate_DeltaT_GregorianLeapDayTest() {
        LocalDate forDate = LocalDate.of(2024, 3, 1);
        assertEquals(-2400.0, DeltaT.estimate(forDate), 1e-6);
    }

}