package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTestDifferentMonths {

    public interface MockContext {
        LocalDate getDate();
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

}