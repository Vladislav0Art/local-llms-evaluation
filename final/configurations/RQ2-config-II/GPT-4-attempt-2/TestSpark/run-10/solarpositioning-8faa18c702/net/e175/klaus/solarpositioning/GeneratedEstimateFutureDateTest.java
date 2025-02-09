package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;

public class GeneratedEstimateFutureDateTest {

    @Test
    public void estimateFutureDateTest() {
        double expectedDT = DeltaT.estimate(LocalDate.now().plusYears(20));
        double actualDT = DeltaT.estimate(LocalDate.now());
        assertNotEquals(expectedDT, actualDT);
    }

}