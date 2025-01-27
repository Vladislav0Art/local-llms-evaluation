package org.traccar.protocol;

public class GeneratedDecodeGpsNoResultWithSatellitesAndSpeedTest {

    private static final byte[] buf = Unpooled.buffer(16);
    private static final ByteBuf bufUtil = ByteBufUtil.INSTANCE;
    private static final SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);

    @Test
    public void decodeGpsNoResultWithSatellitesAndSpeedTest() {
        Position position = new Position();
        boolean hasLength = true;
        boolean hasSatellites = true;
        boolean hasSpeed = true;
        TimeZone timezone = TimeZone.getTimeZone("UTC");
        byte[] result = Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, hasSatellites, hasSpeed, timezone);
        Assert.assertNull(result);
    }

}