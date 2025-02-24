package org.traccar.protocol;

import org.junit.Test;
import org.traccar.BaseTest;

public class GeneratedTest {

    @Test
    public void testGetHasIndex() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        assertFalse(decoder.getHasIndex());
    }

    @Test
    public void testGetManufacturer() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        assertNull(decoder.getManufacturer());
    }

    @Test
    public void testDecode() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        decoder.decode(null, null, null);
    }

}