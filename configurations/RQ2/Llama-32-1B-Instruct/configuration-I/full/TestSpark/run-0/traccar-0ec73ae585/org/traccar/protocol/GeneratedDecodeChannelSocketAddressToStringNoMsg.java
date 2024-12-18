package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeChannelSocketAddressToStringNoMsg {

    @Mock
    private Protocol protocol;

    @Test
    public void decodeChannelSocketAddressToStringNoMsg() {
        // Arrange
        Channel channelMock = Mockito.mock(Channel.class);
        SocketAddress remoteAddressMock = Mockito.mock(SocketAddress.class);

        when(protocol.getChannel()).thenReturn(channelMock);
        when(protocol.getRemoteAddress()).thenReturn(remoteAddressMock);

        Object result = WatchProtocolDecoder.WatchProtocolDecoderInstance.decode(
                channelMock, remoteAddressMock, "");

        // Assert
        assertEquals("ChannelSocketAddress", result.getClass().getSimpleName());
    }

}