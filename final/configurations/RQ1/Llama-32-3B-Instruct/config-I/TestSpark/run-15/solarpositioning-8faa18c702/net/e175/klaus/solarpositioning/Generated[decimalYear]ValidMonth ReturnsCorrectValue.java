package net.e175.klaus.solarpositioning;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Generated[decimalYear]
ValidMonth ReturnsCorrectValue {

private static DeltaT deltaT;

@BeforeClass
public static void setUp() {
    deltaT = new DeltaT();
}

@Test
public void [decimalYear]

ValidMonth ReturnsCorrectValue() {
    LocalDate forDate = LocalDate.of(2024, 1, 15);
    double result = deltaT.decimalYear(forDate);
    assertEquals(84, result);
}

}