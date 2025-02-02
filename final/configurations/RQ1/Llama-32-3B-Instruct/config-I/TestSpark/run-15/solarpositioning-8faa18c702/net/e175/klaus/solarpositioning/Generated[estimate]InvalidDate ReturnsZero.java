package net.e175.klaus.solarpositioning;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Generated[estimate]
InvalidDate ReturnsZero {

private static DeltaT deltaT;

@BeforeClass
public static void setUp() {
    deltaT = new DeltaT();
}

@Test
public void [estimate]

InvalidDate ReturnsZero() {
    LocalDate forDate = LocalDate.of(-500, 12, 31);
    double result = deltaT.estimate(forDate);
    assertEquals(0, result);
}

}