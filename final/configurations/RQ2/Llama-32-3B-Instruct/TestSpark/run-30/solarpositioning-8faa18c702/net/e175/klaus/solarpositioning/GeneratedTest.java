package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    public interface MockContext {
        LocalDate getDate();
    }

    @Test
    public void estimateZeroDeltaT() {
        DeltaT.estimateMock((MockContext) null);
        assertEquals(0, (int) DeltaT.estimateMock());
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

    @Test
    public void testDifferentMonths() {
        Object mockContext = new MockContext() {
            @Override
            public LocalDate getDate() {
                return LocalDate.of(2022, 12, 31);
            }
        };
        DeltaT.estimate(mockContext);
        assertTrue((int) DeltaT.estimateMock() > (int) DeltaT.estimate(new MockContext() {
            @Override
            public LocalDate getDate() {
                return LocalDate.of(2023, 1, 10);
            }
        }));
    }

    @Test
    public void testDifferentYears() {
        Object mockContext = new MockContext() {
            @Override
            public LocalDate getDate() {
                return LocalDate.now().minusYears(20);
            }
        };
        DeltaT.estimate(mockContext);
        assertTrue((int) DeltaT.estimate(mockContext) < (int) DeltaT.estimate(new MockContext() {
            @Override
            public LocalDate getDate() {
                return LocalDate.now();
            }
        }));
    }

    @Test
    public void estimateMockReturnsPositiveValue() {
        Object mockContext = new MockContext() {
            @Override
            public LocalDate getDate() {
                return LocalDate.now();
            }
        };
        when(DeltaT.estimateMock(mockContext), (int) 10);
        assertEquals(10, (int) DeltaT.estimateMock(mockContext));
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