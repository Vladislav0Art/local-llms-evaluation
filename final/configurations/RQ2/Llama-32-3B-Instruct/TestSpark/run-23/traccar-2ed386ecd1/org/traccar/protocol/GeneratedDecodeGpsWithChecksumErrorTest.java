package org.traccar.protocol;

public class GeneratedDecodeGpsWithChecksumErrorTest {

    private static final byte[] buf = Unpooled.buffer(16);
    private static final ByteBuf bufUtil = ByteBufUtil.INSTANCE;
    private static final SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);

    @Test
    public void decodeGpsWithChecksumErrorTest() {
        Position position = new Position();
        byte[] checksum = {0x01};
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, checksum);
        Assert.assertFalse(result);
    }

}