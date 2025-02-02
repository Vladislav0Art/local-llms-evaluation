package net.e175.klaus.solarpositioning;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Generated[decimalYear]
InvalidMonth ReturnsCorrectValue {

private static DeltaT deltaT;

@BeforeClass
public static void setUp() {
    deltaT = new DeltaT();
}

@Test
public void [decimalYear]

InvalidMonth ReturnsCorrectValue() {
    LocalDate forDate = LocalDate.of(-500, 12, 31);
    double result = deltaT.decimalYear(forDate);
    assertEquals(-82.5, result);
}

}