package net.e175.klaus.solarpositioning;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Generated[estimate]
LeapYear ReturnsPositiveValue {

private static DeltaT deltaT;

@BeforeClass
public static void setUp() {
    deltaT = new DeltaT();
}

@Test
public void [estimate]

LeapYear ReturnsPositiveValue() {
    LocalDate forDate = LocalDate.of(2024, 2, 29);
    double result = deltaT.estimate(forDate);
    assertTrue("Result is not positive", result > 0);
}

}