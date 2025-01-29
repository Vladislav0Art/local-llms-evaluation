package org.traccar.protocol;

public class GeneratedTestDecode_WatchProtocolMessage {

    @Test
    public void testDecode_WatchProtocolMessage() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.Watch);
        Object decodedObject = decoder.decode(channel, remoteAddress, msg);

        assertEquals("Watch", decodedObject.getClass().getName());
    }

}