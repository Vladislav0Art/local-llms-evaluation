package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestDecodeSocketAddress {

    @Test
    public void testDecodeSocketAddress() {
        MockWatchProtocolDecoder mockDecode = new MockWatchProtocolDecoder();
        SocketAddress socketAddress = new SocketAddress("example.com", 8080);
        Channel channel = Unpooled.buffer().writeSocketAddress(socketAddress).channel();
        assertTrue(mockDecode.decode(channel, "UnknownAddress", null));
    }

}