package org.traccar.protocol;

public class GeneratedTestDecodePosition {

    @Test
    public void testDecodePosition() throws Exception {
        String positionData = "1234567890ABCDEGHIJKLMNOPQRSTUVWXYZ";
        ByteBuf byteBuf = BufferUtil.newByteBuf(positionData, 16);
        Channel channel = Unpooled.buffer();
        SocketAddress remoteAddress = new SocketAddress("127.0.0.1", 8888);

        BaseProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        Object message = decoder.decode(channel, remoteAddress, byteBuf);

        Position position = Parser.parsePosition(message);
        assertTrue(position != null);
    }

}