package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedDecode_SingleMessage_Test {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    public WatchProtocolDecoderTest() {
    }

    @Test
    public void decode_SingleMessage_Test() {
        Channel channelMock = Mockito.mock(Channel.class);
        SocketAddress remoteAddressMock = Mockito.mock(SocketAddress.class);

        when(channelMock.getRemoteAddress()).thenReturn(remoteAddressMock);
        String result = new WatchProtocolDecoder(new Protocol()).decode(channelMock, remoteAddressMock);

        Mockito.verify(channelMock, Mockito.times(1)).getRemoteAddress();
    }

}