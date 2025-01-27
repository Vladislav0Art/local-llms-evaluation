package org.traccar.protocol;

public class GeneratedDecodeGpsPositionWithLengthTest {

    private static final byte[] buf = Unpooled.buffer(16);
    private static final ByteBuf bufUtil = ByteBufUtil.INSTANCE;
    private static final SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);

    @Test
    public void decodeGpsPositionWithLengthTest() {
        Position position = new Position();
        boolean hasLength = true;
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, false);
        Assert.assertTrue(result);
    }

}