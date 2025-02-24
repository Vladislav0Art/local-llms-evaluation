package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertNotNull(decoder);
    }

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        assertEquals(false, decoder.getHasIndex());
    }

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        assertEquals("", decoder.getManufacturer());
    }

    @Test
    public void decodeTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = null;
        SocketAddress remoteAddress = null;
        Object msg = null;
        assertNull(decoder.decode(channel, remoteAddress, msg));
    }

}