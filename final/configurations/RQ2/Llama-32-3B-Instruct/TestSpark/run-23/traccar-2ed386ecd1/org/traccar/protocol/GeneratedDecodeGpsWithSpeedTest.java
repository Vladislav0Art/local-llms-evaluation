package org.traccar.protocol;

public class GeneratedDecodeGpsWithSpeedTest {

    private static final byte[] buf = Unpooled.buffer(16);
    private static final ByteBuf bufUtil = ByteBufUtil.INSTANCE;
    private static final SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);

    @Test
    public void decodeGpsWithSpeedTest() {
        Position position = new Position();
        boolean hasLength = true;
        boolean hasSatellites = true;
        boolean hasSpeed = true;
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, hasSatellites, hasSpeed, false);
        Assert.assertTrue(result);
    }

}