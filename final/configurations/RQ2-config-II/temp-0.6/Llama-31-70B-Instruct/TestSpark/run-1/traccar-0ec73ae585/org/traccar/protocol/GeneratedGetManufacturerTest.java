package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGetManufacturerTest {

    private WatchProtocolDecoder watchProtocolDecoder;

    @Test
    public void getManufacturerTest() {
        watchProtocolDecoder = new WatchProtocolDecoder(null);
        assertEquals("", watchProtocolDecoder.getManufacturer());
    }

}