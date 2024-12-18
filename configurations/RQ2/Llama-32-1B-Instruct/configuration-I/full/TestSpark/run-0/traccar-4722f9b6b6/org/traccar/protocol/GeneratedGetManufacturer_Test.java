package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedGetManufacturer_Test {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    public WatchProtocolDecoderTest() {
    }

    @Test
    public void getManufacturer_Test() {
        Mockito.when(channel.getRemoteAddress()).thenReturn(remoteAddress);
        String result = new WatchProtocolDecoder(new Protocol()).getManufacturer();
        assertEquals("Watch Protocol", result);
    }

}