package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedTestChannel {

    @Test
    public void testChannel() {
        Channel channel = new Channel();
        when(channel.connect()).thenReturn(true);

        SocketAddress remoteAddress = new SocketAddress(1234L, 5678L);
        when(remoteAddress.getAddress()).thenReturn(1234L);
        when(remoteAddress.getPort()).thenReturn(5678L);

        Protocol protocol = new Protocol();
        when(protocol.connect("localhost", remoteAddress)).thenReturn(true);

        Mockito.verifyNoInteractions(channel);
    }

}