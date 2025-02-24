package org.traccar.protocol;

public class GeneratedTest {

    private WatchProtocolDecoder protocolDecoder;

    @Before
    public void setUp() {
        Protocol protocol = new Protocol();
        protocolDecoder = new WatchProtocolDecoder(protocol);
    }

    @Test
    public void testGetHasIndex() {
        assertFalse(protocolDecoder.getHasIndex());
    }

    @Test
    public void testGetManufacturer() {
        assertNotNull(protocolDecoder.getManufacturer());
    }

    @Test
    public void testDecode() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = new Object();
        assertNull(protocolDecoder.decode(channel, remoteAddress, msg));
    }

}