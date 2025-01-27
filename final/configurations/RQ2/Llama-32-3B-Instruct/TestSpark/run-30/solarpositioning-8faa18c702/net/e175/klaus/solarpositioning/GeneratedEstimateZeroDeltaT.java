package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class GeneratedEstimateZeroDeltaT {

    public interface MockContext {
        LocalDate getDate();
    }

    @Test
    public void estimateZeroDeltaT() {
        DeltaT.estimateMock((MockContext) null);
        assertEquals(0, (int) DeltaT.estimateMock());
    }

}