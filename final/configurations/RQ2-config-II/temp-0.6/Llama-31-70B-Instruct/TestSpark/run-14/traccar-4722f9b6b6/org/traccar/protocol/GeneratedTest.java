package org.traccar.protocol;

import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.BaseProtocolDecoder;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testGetHasIndex() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(null);
        assertEquals(false, watchProtocolDecoder.getHasIndex());
    }

    @Test
    public void testGetManufacturer() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(null);
        assertEquals("watch", watchProtocolDecoder.getManufacturer());
    }

    @Test
    public void testDecode() throws Exception {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(null);
        Object result = watchProtocolDecoder.decode(null, null, null);
        assertEquals(null, result);
    }

}