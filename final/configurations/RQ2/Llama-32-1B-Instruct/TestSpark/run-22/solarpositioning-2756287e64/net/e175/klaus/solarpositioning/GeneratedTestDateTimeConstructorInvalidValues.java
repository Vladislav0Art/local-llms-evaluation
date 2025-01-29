package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

public class GeneratedTestDateTimeConstructorInvalidValues {

    @Test
    public void testDateTimeConstructorInvalidValues() {
        try {
            new DateTime(-1, -2, -3); // no-op
        } catch (Exception e) {
            fail("Expected Exception");
        }
    }

}