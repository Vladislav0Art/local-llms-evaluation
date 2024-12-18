package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode ChannelSocketAddressToString_SingleValue {

    @Mock
    private Protocol protocol;

    @Test
    public void decode

    ChannelSocketAddressToString_SingleValue() {
        // Arrange
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        when(protocol.getChannel()).thenReturn(channel);
        when(protocol.getRemoteAddress()).thenReturn(remoteAddress);

        Object result = WatchProtocolDecoder.WatchProtocolDecoderInstance.decode(
                channel, remoteAddress, "12345");

        // Assert
        assertEquals("ChannelSocketAddress", result.getClass().getSimpleName());
    }

}