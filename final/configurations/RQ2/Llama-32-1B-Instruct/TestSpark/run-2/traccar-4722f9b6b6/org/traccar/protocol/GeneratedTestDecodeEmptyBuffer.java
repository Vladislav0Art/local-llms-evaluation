package org.traccar.protocol;

public class GeneratedTestDecodeEmptyBuffer {

    @Test
    public void testDecodeEmptyBuffer() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        Channel channel = Unpooled.buffer().write(new byte[]{}).close();
        SocketAddress remoteAddress = new SocketAddress("127.0.0.1", 8080);

        Object message = decoder.decode(channel, remoteAddress, null);
        assertNull(message);
    }

}