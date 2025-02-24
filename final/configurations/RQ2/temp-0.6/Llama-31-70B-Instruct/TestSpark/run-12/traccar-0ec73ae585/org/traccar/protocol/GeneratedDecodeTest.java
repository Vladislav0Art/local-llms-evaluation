package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Channel channel = null;
        SocketAddress remoteAddress = null;
        Object msg = null;
        assertNull(decoder.decode(channel, remoteAddress, msg));
    }

}