package org.traccar.protocol;

public class GeneratedDecodeGpsWithUnknownMessageIdTest {

    private static final byte[] buf = Unpooled.buffer(16);
    private static final ByteBuf bufUtil = ByteBufUtil.INSTANCE;
    private static final SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);

    @Test
    public void decodeGpsWithUnknownMessageIdTest() {
        Position position = new Position();
        int messageId = 100;
        byte[] result = Gt06ProtocolDecoder.decodeGps(position, buf, true, messageId);
        Assert.assertNull(result);
    }

}