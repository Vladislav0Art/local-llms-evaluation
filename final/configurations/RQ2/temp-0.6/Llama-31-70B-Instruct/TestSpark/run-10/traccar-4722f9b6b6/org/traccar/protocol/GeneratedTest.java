package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testGetHasIndex() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        assertEquals(false, decoder.getHasIndex());
    }

    @Test
    public void testGetManufacturer() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        assertEquals("watch", decoder.getManufacturer());
    }

    @Test
    public void testDecode() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = null;
        SocketAddress remoteAddress = null;
        Object msg = null;
        Object decodedObject = decoder.decode(channel, remoteAddress, msg);
        assertEquals(null, decodedObject);
    }

}