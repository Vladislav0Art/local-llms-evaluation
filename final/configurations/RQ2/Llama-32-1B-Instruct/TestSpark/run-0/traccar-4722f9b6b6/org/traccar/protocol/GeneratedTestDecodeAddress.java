package org.traccar.protocol;

public class GeneratedTestDecodeAddress {

    private static final String CHANNEL = "channel";
    private static final String REMOTE_ADDRESS = "remoteAddress";
    private static final String MESSAGE = "message";

    public WatchProtocolDecoderTest() {
    }

    @Test
    public void testDecodeAddress() throws Exception {
        String addressStr = "10.0.2.3:8081";
        SocketAddress address = parseSocketAddress(addressStr);
        assertEquals(ADDRESS_TYPE.NETTY, address.type());
        assertEquals("10.0.2.3", address.host().getHostAddresses()[0].getAddress().getHostName());
    }

}