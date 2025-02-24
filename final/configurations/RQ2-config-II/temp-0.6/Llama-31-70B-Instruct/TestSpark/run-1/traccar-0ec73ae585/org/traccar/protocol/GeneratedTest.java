package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    private WatchProtocolDecoder watchProtocolDecoder;

    @Test
    public void getHasIndexTest() {
        watchProtocolDecoder = new WatchProtocolDecoder(null);
        assertEquals(false, watchProtocolDecoder.getHasIndex());
    }

    @Test
    public void getManufacturerTest() {
        watchProtocolDecoder = new WatchProtocolDecoder(null);
        assertEquals("", watchProtocolDecoder.getManufacturer());
    }

}