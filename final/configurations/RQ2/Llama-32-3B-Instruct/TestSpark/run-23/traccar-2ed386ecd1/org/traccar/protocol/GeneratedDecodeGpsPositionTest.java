package org.traccar.protocol;

public class GeneratedDecodeGpsPositionTest {

    private static final byte[] buf = Unpooled.buffer(16);
    private static final ByteBuf bufUtil = ByteBufUtil.INSTANCE;
    private static final SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);

    @Test
    public void decodeGpsPositionTest() {
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true);
        Assert.assertTrue(result);
    }

}