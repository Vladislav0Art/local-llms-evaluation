package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTestPositiveDeltaT {

    public interface MockContext {
        LocalDate getDate();
    }

    @Test
    public void testPositiveDeltaT() {
        Object mockContext = new MockContext() {
            @Override
            public LocalDate getDate() {
                return LocalDate.now().plusDays(10);
            }
        };
        DeltaT.estimate(mockContext);
        assertTrue((int) DeltaT.estimateMock() > 0);
    }

}