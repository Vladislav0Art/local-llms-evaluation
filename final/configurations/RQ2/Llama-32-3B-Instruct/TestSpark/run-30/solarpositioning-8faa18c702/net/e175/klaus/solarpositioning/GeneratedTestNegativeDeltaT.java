package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTestNegativeDeltaT {

    public interface MockContext {
        LocalDate getDate();
    }

    @Test
    public void testNegativeDeltaT() {
        Object mockContext = new MockContext() {
            @Override
            public LocalDate getDate() {
                return LocalDate.now().minusDays(10);
            }
        };
        DeltaT.estimate(mockContext);
        assertTrue((int) DeltaT.estimateMock() < 0);
    }

}