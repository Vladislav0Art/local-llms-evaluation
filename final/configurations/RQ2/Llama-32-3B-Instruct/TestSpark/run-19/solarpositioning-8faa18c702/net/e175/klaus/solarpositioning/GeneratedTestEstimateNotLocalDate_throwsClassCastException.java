package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Optional;

public class GeneratedTestEstimateNotLocalDate_throwsClassCastException {

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
    public void testEstimateNotLocalDate_throwsClassCastException() {
        assertThrows(ClassCastException.class, () -> DeltaT.estimate("2022-06-15"));
    }

}