package org.traccar.protocol;

public class GeneratedTestDecode {

    private WatchProtocolDecoder protocolDecoder;

    @Before
    public void setUp() {
        Protocol protocol = new Protocol();
        protocolDecoder = new WatchProtocolDecoder(protocol);
    }

    @Test
    public void testDecode() throws Exception {
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object msg = new Object();
        assertNull(protocolDecoder.decode(channel, remoteAddress, msg));
    }

}