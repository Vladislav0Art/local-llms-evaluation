package org.traccar.protocol;

public class GeneratedDecodeGpsSuccessTest {

    private static final byte[] buf = Unpooled.buffer(16);
    private static final ByteBuf bufUtil = ByteBufUtil.INSTANCE;
    private static final SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);

    @Test
    public void decodeGpsSuccessTest() {
        Position position = new Position();
        boolean hasLength = true;
        TimeZone timezone = TimeZone.getTimeZone("UTC");
        byte[] result = Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, false, false, timezone);
        Assert.assertNotNull(result);
    }

}