package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class GeneratedEstimateMockReturnsNegativeValue {

    public interface MockContext {
        LocalDate getDate();
    }

    @Test
    public void estimateMockReturnsNegativeValue() {
        Object mockContext = new MockContext() {
            @Override
            public LocalDate getDate() {
                return LocalDate.now();
            }
        };
        when(DeltaT.estimateMock(mockContext), (-5));
        assertEquals(-5, (int) DeltaT.estimateMock(mockContext));
    }

}

public class DeltaT {

    private static Map<LocalDate, Double> mockValues = new HashMap<>();

    public static void estimate(MockContext context) {
        LocalDate date = context.getDate();
        if (mockValues.containsKey(date)) {
            return;
        } else {
            double value = mockValues.getOrDefault(LocalDate.now(), 0.0);
            mockValues.put(date, value + Math.random() * 2 - 1);
        }
    }

    public static void estimateMock(MockContext context) {
        LocalDate date = context.getDate();
        return mockValues.computeIfAbsent(date, k -> Math.random() * 10 - 5);
    }

}

public class MockContext implements MockContext {

    @Override
    public LocalDate getDate() {
        return LocalDate.now();
    }

}