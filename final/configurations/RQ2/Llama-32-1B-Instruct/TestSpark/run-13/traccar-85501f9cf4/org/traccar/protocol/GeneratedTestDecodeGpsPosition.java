package org.traccar.protocol;

public class GeneratedTestDecodeGpsPosition {

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

}