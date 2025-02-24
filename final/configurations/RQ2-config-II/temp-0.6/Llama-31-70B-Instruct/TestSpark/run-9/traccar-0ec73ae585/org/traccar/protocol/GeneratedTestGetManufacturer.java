package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTestGetManufacturer {

    @Test
    public void testGetManufacturer() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(null);
        String manufacturer = watchProtocolDecoder.getManufacturer();
        assertEquals("Watch", manufacturer);
    }

}