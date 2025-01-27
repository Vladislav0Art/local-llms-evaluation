package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestConvertUnit {

    @Test
    public void testConvertUnit() {
        double value = 10.0;
        String fromUnit = "cm";
        String toUnit = "m";

        assertEquals("10.0", UnitsConverter.convertUnit(value, fromUnit, toUnit));
    }

}