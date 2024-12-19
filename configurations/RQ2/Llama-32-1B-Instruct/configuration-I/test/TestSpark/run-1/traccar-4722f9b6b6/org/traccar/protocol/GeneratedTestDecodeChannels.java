package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestDecodeChannels {

    @Test
    public void testDecodeChannels() {
        Mockito.mock(Channel.class, Mockito.RETURNS_RANDOM_VALUE);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        when(decoder.decode(any Channel.class, any SocketAddress.class, any Object.class)).thenReturn("Random Data");
        String result = decoder.decode(Mockito.any(Channel.class), Mockito.any(SocketAddress.class, Mockito.any(Object.class));
        assertEquals("Random Data", result);
    }

}