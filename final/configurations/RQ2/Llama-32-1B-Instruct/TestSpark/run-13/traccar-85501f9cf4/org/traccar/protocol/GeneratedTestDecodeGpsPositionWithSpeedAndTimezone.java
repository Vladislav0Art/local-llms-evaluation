package org.traccar.protocol;

public class GeneratedTestDecodeGpsPositionWithSpeedAndTimezone {

    private Protocol protocol;
    private SocketAddress remoteAddress;

    @Before
    public void setUp() {
        protocol = new Protocol();
        remoteAddress = "127.0.0.1";
    }

    @Test
    public void testDecodeGpsPositionWithSpeedAndTimezone() throws Exception {
        byte[] buf = new byte[32];
        int offset = 0;
        assertTrue(decodeGt06ProtocolDecoder(buf, offset, true, false, false, TimeZone.getTimeZone()));
    }

}