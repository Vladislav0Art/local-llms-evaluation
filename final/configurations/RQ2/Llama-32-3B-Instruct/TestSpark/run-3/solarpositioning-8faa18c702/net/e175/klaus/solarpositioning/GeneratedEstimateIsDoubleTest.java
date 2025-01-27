package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;

public class GeneratedEstimateIsDoubleTest {

    @Test
    public void estimateIsDoubleTest() {
        assertTrue(Double.class.isInstance(DeltaT.estimate(LocalDate.now())));
    }

}