package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;

public class GeneratedEstimatePastDateTest {

    @Test
    public void estimatePastDateTest() {
        double expectedDT = DeltaT.estimate(LocalDate.now().minusYears(20));
        double actualDT = DeltaT.estimate(LocalDate.now());
        assertNotEquals(expectedDT, actualDT);
    }

}