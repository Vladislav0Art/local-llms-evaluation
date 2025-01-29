package org.traccar.protocol;

public class GeneratedTestDecodeMessage {

    private WatchProtocolDecoder decoder;

    @Before
    public void setup() {
        decoder = new WatchProtocolDecoder(new Protocol());
    }

    @Test
    public void testDecodeMessage() throws Exception {
        ByteBuf buffer = Unpooled.wrappedByteBuf(new byte[]{});
        Channel channel = null;
        Object message = "TEST Message";
        socketAddress remoteAddress = new SocketAddress("127.0.0.1", 1234);

        decoder.decode(channel, remoteAddress, message);
    }

}