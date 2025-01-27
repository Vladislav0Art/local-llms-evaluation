package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.mockito.Mockito.when;

public class GeneratedEstimateForNonExistentDateReturnsException {

    public static double estimate(LocalDate forDate) {
        // implementation
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.time.LocalDate;
import org.mockito.Mockito.when;

public class DeltaTTest {

    @Test
    public void estimateForNonExistentDateReturnsException() {
        try {
            DeltaT.estimate(null);
            assert false;
        } catch (NullPointerException e) {
            // expected
        }
    }

}