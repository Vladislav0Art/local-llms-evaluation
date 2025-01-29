package org.traccar.protocol;

public class GeneratedTestDecodeGpsPositionWithSatellites {

    private Protocol protocol;
    private SocketAddress remoteAddress;

    @Before
    public void setUp() {
        protocol = new Protocol();
        remoteAddress = "127.0.0.1";
    }

    @Test
    public void testDecodeGpsPositionWithSatellites() throws Exception {
        byte[] buf = new byte[24];
        int offset = 0;
        assertTrue(decodeGt06ProtocolDecoder(buf, offset, true, true, false, null));
    }

}