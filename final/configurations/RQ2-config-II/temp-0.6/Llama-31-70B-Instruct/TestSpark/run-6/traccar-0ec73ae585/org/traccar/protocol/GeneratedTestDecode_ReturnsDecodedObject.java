package org.traccar.protocol;

public class GeneratedTestDecode_ReturnsDecodedObject {

    // Tests for getHasIndex() method

    @Test
    public void testDecode_ReturnsDecodedObject() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);

        Object decodedObject = decoder.decode(channel, remoteAddress, msg);
        assertNotNull(decodedObject);
    }

}