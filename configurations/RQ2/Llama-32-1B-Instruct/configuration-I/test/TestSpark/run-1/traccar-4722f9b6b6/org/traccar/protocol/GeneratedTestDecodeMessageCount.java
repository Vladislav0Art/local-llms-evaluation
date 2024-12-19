package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestDecodeMessageCount {

    @Test
    public void testDecodeMessageCount() {
        Mockito.mock(Object.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        when(decoder.decode(any Channel.class, any SocketAddress.class, any Object.class)).thenReturn("Some Message Count");
        String result = decoder.decode(Mockito.any(Channel.class), Mockito.any(SocketAddress.class, Mockito.any(Object.class));
        assertEquals("Some Message Count", result);
    }

}