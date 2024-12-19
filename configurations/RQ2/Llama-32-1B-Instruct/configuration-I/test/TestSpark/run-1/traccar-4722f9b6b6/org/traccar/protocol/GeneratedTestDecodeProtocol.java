package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestDecodeProtocol {

    @Test
    public void testDecodeProtocol() {
        Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        when(decoder.decode(any Channel.class, any SocketAddress.class, any Object.class)).thenReturn(decoder.getProtocol());
        Protocol protocol = Mockito.mock(Protocol.class);
        when(decoder.getProtocol()).thenReturn(protocol);
        String result = decoder.decode(Mockito.any(Channel.class), Mockito.any(SocketAddress.class, Mockito.any(Object.class));
        assertEquals(protocol, result);
    }

}