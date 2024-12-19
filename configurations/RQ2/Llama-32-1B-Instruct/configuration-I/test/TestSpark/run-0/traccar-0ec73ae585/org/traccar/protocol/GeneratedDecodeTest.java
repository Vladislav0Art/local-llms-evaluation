package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);

        Protocol protocol = new Protocol();

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Mockito.when(decoder.decode(channel, remoteAddress, msg)).thenReturn("Test Message");

        assertEquals("Test Message", decoder.decode(channel, remoteAddress, msg));
    }

}