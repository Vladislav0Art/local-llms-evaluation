package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedGetHasIndex_Test {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    public WatchProtocolDecoderTest() {
    }

    @Test
    public void getHasIndex_Test() {
        Mockito.when(channel.getRemoteAddress()).thenReturn(remoteAddress);
        boolean result = new WatchProtocolDecoder(new Protocol()).getHasIndex();
        assertTrue(result);
    }

}