package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedDecodeTest {

    private WatchProtocolDecoder decoder;

    public WatchProtocolDecoderTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        decoder = new WatchProtocolDecoder(protocol);
    }

    @Test
    public void decodeTest() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);
        when(decoder.decode(channel, remoteAddress, msg)).thenReturn(Mockito.any());
        assertEquals(Mockito.any(), decoder.decode(channel, remoteAddress, msg));
    }

}