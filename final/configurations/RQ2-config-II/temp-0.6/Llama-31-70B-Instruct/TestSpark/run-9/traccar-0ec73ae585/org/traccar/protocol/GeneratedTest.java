package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testGetHasIndex() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(null);
        boolean hasIndex = watchProtocolDecoder.getHasIndex();
        assertEquals(true, hasIndex);
    }

    @Test
    public void testGetManufacturer() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(null);
        String manufacturer = watchProtocolDecoder.getManufacturer();
        assertEquals("Watch", manufacturer);
    }

    @Test
    public void testDecode() throws Exception {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(null);
        Object result = watchProtocolDecoder.decode(null, null, null);
        assertNull(result);
    }

}