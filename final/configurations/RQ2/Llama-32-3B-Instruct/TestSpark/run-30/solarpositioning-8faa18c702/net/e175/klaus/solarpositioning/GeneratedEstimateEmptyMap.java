package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class GeneratedEstimateEmptyMap {

    @Test
    public void estimateEmptyMap() {
        when(DeltaT.estimateMock()).thenReturn(0.0);
        double result = DeltaT.estimateMock();
        assertEquals(0, result);
    }

}