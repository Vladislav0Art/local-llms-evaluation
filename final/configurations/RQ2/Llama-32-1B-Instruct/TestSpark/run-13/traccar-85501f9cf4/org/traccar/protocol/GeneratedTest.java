package org.traccar.protocol;

public class GeneratedTest {

    private Protocol protocol;
    private SocketAddress remoteAddress;

    @Before
    public void setUp() {
        protocol = new Protocol();
        remoteAddress = "127.0.0.1";
    }

    @Test
    public void testDecodeGpsPosition() throws Exception {
        byte[] buf = new byte[16];
        int offset = 0;
        assertTrue(decodeGt06ProtocolDecoder(buf, offset, true, null, false, TimeZone.getTimeZone()));
    }

    @Test
    public void testDecodeGpsPositionWithSatellites() throws Exception {
        byte[] buf = new byte[24];
        int offset = 0;
        assertTrue(decodeGt06ProtocolDecoder(buf, offset, true, true, false, null));
    }

    @Test
    public void testDecodeGpsPositionWithSpeedAndTimezone() throws Exception {
        byte[] buf = new byte[32];
        int offset = 0;
        assertTrue(decodeGt06ProtocolDecoder(buf, offset, true, false, false, TimeZone.getTimeZone()));
    }

    @Test
    public void testDecodeGpsPositionWithChecksum() throws Exception {
        byte[] buf = new byte[16];
        int offset = 0;
        assertTrue(decodeGt06ProtocolDecoder(buf, offset, true, null, true, null));
    }

    @Test
    public void testDecodePosition() throws Exception {
        byte[] buf = new byte[8];
        int offset = 0;
        assertTrue(decodePosition(buf, offset, null, false, null, null));
    }

    private boolean decodeGt06ProtocolDecoder(byte[] buf, int offset, boolean hasLength, boolean hasSatellites, boolean hasSpeed, TimeZone timezone) {
        return Protocol.decodeGpsPosition(buf, offset, hasLength, hasSatellites, hasSpeed, timezone);
    }

    @Test
    public void testDecodeGpsTimezone() throws Exception {
        byte[] buf = new byte[32];
        int offset = 0;
        assertTrue(decodeGt06ProtocolDecoder(buf, offset, false, null, true, TimeZone.getTimeZone()));
    }

    private boolean decodePosition(byte[] buf, int offset, boolean hasLength, boolean hasSatellites, boolean hasSpeed) {
        return Protocol.decodePosition(buf, offset, hasLength, hasSatellites, hasSpeed);
    }
}

class Gt06ProtocolDecoderImpl extends Gt06ProtocolDecoder {

    @Override
    protected Object decode(Channel channel, SocketAddress remoteAddress, Object msg) throws Exception {
        return decodeGt06ProtocolDecoder((ByteBuf) msg, 0, true, null, false, TimeZone.getTimeZone());
    }

}