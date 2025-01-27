package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class GeneratedEstimateWithMockedValue {

    @Test
    public void estimateWithMockedValue() {
        Map<LocalDate, Double> map = new HashMap<>();
        map.put(LocalDate.now(), 10.0);
        when(DeltaT.estimateMock()).thenReturn(10.0);
        double result = DeltaT.estimateMock();
        assertEquals(10, result);
    }

}