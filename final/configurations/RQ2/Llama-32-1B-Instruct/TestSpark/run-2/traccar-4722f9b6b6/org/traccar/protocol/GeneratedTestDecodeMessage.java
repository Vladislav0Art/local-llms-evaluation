package org.traccar.protocol;

public class GeneratedTestDecodeMessage {

    @Test
    public void testDecodeMessage() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        byte[] buffer = "1234567890abcdef".getBytes(StandardCharsets.UTF_8);
        Channel channel = Unpooled.buffer().write(buffer).close();
        SocketAddress remoteAddress = new SocketAddress("127.0.0.1", 8080);

        Object message = decoder.decode(channel, remoteAddress, null);
        assertNotNull(message);
    }

}