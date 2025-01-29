package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import static java.time.LocalDateTime.now;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestEstimate_InfinityIsReturned_WhenForDateIsBeforeFirstSolarTerm {

    public double estimate(LocalDate forDate) { /* implementation */ }

}

package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class DeltaTTest {

    @Test
    public void testEstimate_InfinityIsReturned_WhenForDateIsBeforeFirstSolarTerm() {
        Mockito.when(SolarPositioning.estimate(forDate)).thenReturn(Double.POSITIVE_INFINITY);
        System.out.println("SolarPositioning.estimate(" + forDate + ") -> " + SolarPositioning.estimate(forDate));
    }

}