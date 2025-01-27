package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class GeneratedEstimateMockReturnsPositiveValue {

    public interface MockContext {
        LocalDate getDate();
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

}