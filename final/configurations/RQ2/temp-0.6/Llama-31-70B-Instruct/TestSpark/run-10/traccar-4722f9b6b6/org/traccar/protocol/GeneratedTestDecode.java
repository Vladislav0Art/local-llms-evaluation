package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestDecode {

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