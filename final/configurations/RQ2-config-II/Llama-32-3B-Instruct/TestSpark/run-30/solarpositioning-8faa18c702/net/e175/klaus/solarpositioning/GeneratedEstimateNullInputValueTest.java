package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

public class GeneratedEstimateNullInputValueTest {

    @Test
    public void estimateNullInputValueTest() {
        assertThrows(NullPointerException.class, () -> DeltaT.estimate(null));
    }

}