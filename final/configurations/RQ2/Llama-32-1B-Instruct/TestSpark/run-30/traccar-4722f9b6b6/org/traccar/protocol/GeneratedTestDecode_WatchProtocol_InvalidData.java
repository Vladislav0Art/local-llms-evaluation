package org.traccar.protocol;

public class GeneratedTestDecode_WatchProtocol_InvalidData {

    @Test
    public void testDecode_WatchProtocol_InvalidData() throws Exception {
        String message = "{\"watch\":{\"location\":{\"lat\":10.0,\"lon\":101.0,\"height\":100,\"altitude\":20,\"timestamp\":\"2023-02-20T14:30:00.000Z\"}}";
        ByteBuf buffer = Unpooled.buffer(message.getBytes(StandardCharsets.UTF_8));
        Channel channel = new Channel(Unpooled.buffer().toSocketChannel());
        SocketAddress remoteAddress = new SocketAddress("localhost", 8080);
        Object msg = decoder.decode(channel, remoteAddress, buffer);
        assertFalse((Position) msg instanceof Position);
    }

}