package net.e175.klaus.solarpositioning;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Generated[estimate]
ValidDate ReturnsPositiveValue {

private static DeltaT deltaT;

@BeforeClass
public static void setUp() {
    deltaT = new DeltaT();
}

@Test
public void [estimate]

ValidDate ReturnsPositiveValue() {
    LocalDate forDate = LocalDate.of(2024, 1, 15);
    double result = deltaT.estimate(forDate);
    assertTrue("Result is not positive", result > 0);
}

}