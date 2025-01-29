package org.traccar.protocol;

public class GeneratedTestDecode_WatchProtocol_NoData {

    @Test
    public void testDecode_WatchProtocol_NoData() throws Exception {
        String message = "{\"watch\":{}}";
        ByteBuf buffer = Unpooled.buffer(message.getBytes(StandardCharsets.UTF_8));
        Channel channel = new Channel(Unpooled.buffer().toSocketChannel());
        SocketAddress remoteAddress = new SocketAddress("localhost", 8080);
        Object msg = decoder.decode(channel, remoteAddress, buffer);
        assertNull(msg);
    }

}