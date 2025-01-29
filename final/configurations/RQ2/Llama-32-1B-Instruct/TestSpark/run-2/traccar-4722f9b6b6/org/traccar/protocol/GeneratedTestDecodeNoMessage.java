package org.traccar.protocol;

public class GeneratedTestDecodeNoMessage {

    @Test
    public void testDecodeNoMessage() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        Channel channel = Unpooled.buffer().write("Hello World!".getBytes(StandardCharsets.UTF_8).toArray());
        SocketAddress remoteAddress = new SocketAddress("127.0.0.1", 8080);

        Object message = decoder.decode(channel, remoteAddress, null);
        assertNull(message);
    }

}