package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mockito;

public class GeneratedTestGetManufacturerMocked {

    @Test
    public void testGetManufacturerMocked() {
        protocol.getManufacturer(mockManagerdator);
        assertEquals(expected, (String) mockManagerdator, "'expected' should equal '" + expected + "'");
    }

    private Object mockHasIndex = Mockito.mock(boolean.class);
    private Object mockManufacturer = Mockito.mock(String.class);
}

}