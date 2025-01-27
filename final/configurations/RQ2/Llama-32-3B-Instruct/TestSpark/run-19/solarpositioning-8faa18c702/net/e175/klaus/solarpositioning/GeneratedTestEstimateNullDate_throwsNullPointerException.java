package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Optional;

public class GeneratedTestEstimateNullDate_throwsNullPointerException {

    public static double estimate(final LocalDate forDate) { /* implementation */ }

    public static boolean isDeltaT(double deltaT) {
        // method implementation
        return true; // or false based on condition
    }
}

package net.e175.klaus.solarpositioning;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.time.LocalDate;
import java.util.Optional;

public class DeltaTTest {

    @Test
    public void testEstimateNullDate_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> (Optional<Double>) DeltaT.estimate(null).orElseThrow());
    }

}