package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertCloseTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNever;

public class GeneratedTestEstimate_NegativesAreNotHandledYet {

    public double estimate(LocalDate forDate) { /* implementation */ }

}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertCloseTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNever;

public class DeltaTTest {

    @Test
    public void testEstimate_NegativesAreNotHandledYet() {
        assertFalse(SolarPositioning.estimate(LocalDate.now()).isNegative());
    }

}