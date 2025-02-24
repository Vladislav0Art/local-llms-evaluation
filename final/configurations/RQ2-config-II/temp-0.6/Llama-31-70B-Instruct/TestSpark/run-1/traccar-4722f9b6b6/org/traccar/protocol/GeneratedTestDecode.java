package org.traccar.protocol;

public class GeneratedTestDecode {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder();

    @Test
    public void testDecode() {
        Channel channel = null;
        SocketAddress remoteAddress = null;
        Object msg = null;
        assertNotNull(decoder.decode(channel, remoteAddress, msg));
    }

}