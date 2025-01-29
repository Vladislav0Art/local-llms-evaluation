package org.traccar.protocol;

public class GeneratedTestDecode_WatchProtocolMessage_InvalidNetwork {

    @Test
    public void testDecode_WatchProtocolMessage_InvalidNetwork() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.Watch);
        try {
            decoder.decode(channel, remoteAddress, msg);
            fail("Expected Exception");
        } catch (Exception e) {
            assertEquals("Invalid network", e.getMessage());
        }
    }

}