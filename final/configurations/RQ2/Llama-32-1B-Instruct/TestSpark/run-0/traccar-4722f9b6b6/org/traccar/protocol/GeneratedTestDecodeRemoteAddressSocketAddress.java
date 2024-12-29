package org.traccar.protocol;

public class GeneratedTestDecodeRemoteAddressSocketAddress {

    private static final String CHANNEL = "channel";
    private static final String REMOTE_ADDRESS = "remoteAddress";
    private static final String MESSAGE = "message";

    public WatchProtocolDecoderTest() {
    }

    @Test
    public void testDecodeRemoteAddressSocketAddress() throws Exception {
        String remoteAddressStr = "remoteAddress:10.0.2.3";
        SocketAddress remoteAddress = parseSocketAddress(remoteAddressStr);
        Object msg = decodeChannel(remoteAddress, REMOTE_ADDRESS, MESSAGE);
        assertNotNull(msg);
        assertEquals(REMOTE_ADDRESS, (String) msg);
    }

}