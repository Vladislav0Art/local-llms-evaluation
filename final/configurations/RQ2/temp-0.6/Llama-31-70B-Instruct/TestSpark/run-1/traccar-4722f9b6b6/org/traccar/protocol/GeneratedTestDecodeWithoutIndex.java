package org.traccar.protocol;

public class GeneratedTestDecodeWithoutIndex {

    private WatchProtocolDecoder watchProtocolDecoder;

    @Before
    public void setup() {
        Protocol protocol = Mockito.mock(Protocol.class);
        watchProtocolDecoder = new WatchProtocolDecoder(protocol);
    }

    @Test
    public void testDecodeWithoutIndex() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = new SocketAddress() {
            @Override
            public String toString() {
                return "socketAddress";
            }
        };
        Object msg = new Object();
        watchProtocolDecoder.getHasIndex();
        assertNull(watchProtocolDecoder.decode(channel, remoteAddress, msg));
    }

}