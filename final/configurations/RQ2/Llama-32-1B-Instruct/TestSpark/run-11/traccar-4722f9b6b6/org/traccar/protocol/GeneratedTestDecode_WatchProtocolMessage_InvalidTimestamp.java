package org.traccar.protocol;

public class GeneratedTestDecode_WatchProtocolMessage_InvalidTimestamp {

    @Test
    public void testDecode_WatchProtocolMessage_InvalidTimestamp() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.Watch);
        try {
            decoder.decode(channel, remoteAddress, msg);
            fail("Expected Exception");
        } catch (Exception e) {
            assertEquals("Invalid timestamp", e.getMessage());
        }
    }

}