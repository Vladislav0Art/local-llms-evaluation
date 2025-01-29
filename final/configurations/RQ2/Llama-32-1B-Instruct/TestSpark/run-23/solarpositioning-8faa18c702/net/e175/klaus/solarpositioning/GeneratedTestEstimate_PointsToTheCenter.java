package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertCloseTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNever;

public class GeneratedTestEstimate_PointsToTheCenter {

    public double estimate(LocalDate forDate) { /* implementation */ }

}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertCloseTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNever;

public class DeltaTTest {

    @Test
    public void testEstimate_PointsToTheCenter() {
        assertCloseTo(SolarPositioning.estimate(LocalDate.now()), 10000, 0.01);
    }

}