package org.traccar.protocol;

public class GeneratedTestProtocolDecode {

    @Test
    public void testProtocolDecode() {
        MockWatchProtocolDecoder decoder = new MockWatchProtocolDecoder();
        expectAnyTimes(decoder.decode, (Channel channel, SocketAddress remoteAddress, Object msg) -> true);

        verifyAnyTimes(decoder.decode, () -> {
        });

        when(protocol.decode(any(Channel.class), any(SocketAddress.class), any(Object.class))).thenReturn(decoder);
    }

}