package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTestDifferentYears {

    public interface MockContext {
        LocalDate getDate();
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

}