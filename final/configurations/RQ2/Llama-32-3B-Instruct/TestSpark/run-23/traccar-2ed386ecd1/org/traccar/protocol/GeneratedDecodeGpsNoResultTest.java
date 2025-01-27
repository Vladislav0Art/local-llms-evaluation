package org.traccar.protocol;

public class GeneratedDecodeGpsNoResultTest {

    private static final byte[] buf = Unpooled.buffer(16);
    private static final ByteBuf bufUtil = ByteBufUtil.INSTANCE;
    private static final SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);

    @Test
    public void decodeGpsNoResultTest() {
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true);
        Assert.assertFalse(result);
    }

}