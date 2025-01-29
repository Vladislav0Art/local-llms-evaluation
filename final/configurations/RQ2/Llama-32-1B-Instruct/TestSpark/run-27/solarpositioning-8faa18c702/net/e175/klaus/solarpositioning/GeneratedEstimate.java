package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class GeneratedEstimate {

    @Test
    public void estimate() {
        MockDeltaPlusDaysForDate mockMethod = new MockDeltaPlusDaysForDate(forDate, 30);
        deltaT = new DeltaT(forDate);
        double actual = deltaT.estimate();
        assertDoubleEquals(31, actual, 0.00001);
    }
}

}