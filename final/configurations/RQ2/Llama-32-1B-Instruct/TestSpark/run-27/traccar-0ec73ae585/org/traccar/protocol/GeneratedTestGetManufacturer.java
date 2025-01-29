package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetManufacturer {

    @Test
    public void testGetManufacturer() {
        MockWatchProtocolDecoder mockDecode = new MockWatchProtocolDecoder();
        String manufacturer = mockDecode.getManufacturer();
        assertNotNull(manufacturer);
        assertEquals("TRACCAR", manufacturer);
    }

}