package org.traccar.protocol;

public class GeneratedTestDecodeGpsPositionWithChecksum {

    private Protocol protocol;
    private SocketAddress remoteAddress;

    @Before
    public void setUp() {
        protocol = new Protocol();
        remoteAddress = "127.0.0.1";
    }

    @Test
    public void testDecodeGpsPositionWithChecksum() throws Exception {
        byte[] buf = new byte[16];
        int offset = 0;
        assertTrue(decodeGt06ProtocolDecoder(buf, offset, true, null, true, null));
    }

}