package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedDecodeTest {

    private WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol());

    @Test
    public void decodeTest() {
        Object msg = new Object();
        Channel channel = null;
        SocketAddress remoteAddress = null;
        try {
            assertNotNull(watchProtocolDecoder.decode(channel, remoteAddress, msg));
        } catch (Exception e) {
            fail();
        }
    }

}