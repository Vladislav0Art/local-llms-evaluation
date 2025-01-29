package org.traccar.protocol;

public class GeneratedTestDecodePosition {

    private Protocol protocol;
    private SocketAddress remoteAddress;

    @Before
    public void setUp() {
        protocol = new Protocol();
        remoteAddress = "127.0.0.1";
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

}