package org.traccar.protocol;

public class GeneratedTestDecodeNetwork {

    @Test
    public void testDecodeNetwork() throws Exception {
        String networkData = "1234567890ABCDEGHIJKLMNOPQRSTUVWXYZ";
        ByteBuf byteBuf = BufferUtil.newByteBuf(networkData, 32);
        Channel channel = Unpooled.buffer();
        SocketAddress remoteAddress = new SocketAddress("127.0.0.1", 8888);

        BaseProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        Object message = decoder.decode(channel, remoteAddress, byteBuf);

        Network network = Parser.parseNetwork(message);
        assertTrue(network != null);
    }

}