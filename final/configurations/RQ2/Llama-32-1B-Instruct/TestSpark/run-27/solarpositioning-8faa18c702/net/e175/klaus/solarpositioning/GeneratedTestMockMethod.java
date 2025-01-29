package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class GeneratedTestMockMethod {

    @Test
    public void testMockMethod() {
        deltaT = new DeltaT(forDate);
        double actual = deltaT.estimate();
        assertDoubleEquals(Math.sqrt(100), actual, 0.00001);
    }
}

public static class DeltaT {
    private final LocalDate forDate;

    public DeltaT(LocalDate forDate) {
        this.forDate = forDate;
    }

}