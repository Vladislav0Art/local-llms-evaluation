package org.traccar.protocol;

public class GeneratedTestDecodeChannelSocketAddress {

    @Test
    public void testDecodeChannelSocketAddress() throws Exception {
        Protocol protocol = new Protocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = new Channel();
        SocketAddress socketAddress = PatternBuilder.toSocketAddress(channel, 12345);
        Object message = decoder.decode(socketAddress, null, null);

        assertNotNull(message);
        assertEquals(12345, (Integer) message);
    }

}