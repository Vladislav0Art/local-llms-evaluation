package org.traccar.protocol;

public class GeneratedTestDecodeGpsTimezone {

    private Protocol protocol;
    private SocketAddress remoteAddress;

    @Before
    public void setUp() {
        protocol = new Protocol();
        remoteAddress = "127.0.0.1";
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