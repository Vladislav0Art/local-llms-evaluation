package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mockito;

public class GeneratedTestGetManufacturer {

    @Test
    public void testGetManufacturer() {
        protocol.setManufacturer("TEST_CASE_2");
        assertEquals(expected, (String) result, "'expected' should equal '" + expected + "'");
    }

    private Object mockHasIndex = Mockito.mock(boolean.class);
    private Object mockManufacturer = Mockito.mock(String.class);
}

}