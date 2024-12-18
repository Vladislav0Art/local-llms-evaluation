package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Test
    public void getHasIndex_returnsFalse() {
        // Arrange
        when(protocol.getHasIndex()).thenReturn(false);

        // Act and Assert
        Object result = WatchProtocolDecoder.WatchProtocolDecoderInstance.getHasIndex();
        assertEquals(false, result);
    }

    @Test
    public void getManufacturer_returnsEmptyString() {
        // Arrange
        when(protocol.getManufacturer()).thenReturn("");

        // Act and Assert
        String result = WatchProtocolDecoder.WatchProtocolDecoderInstance.getManufacturer();
        assertEquals("", result);
    }

    @Test
    public void decodeChannelSocketAddressToString() {
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

    @Test
    public void decodeChannelSocketAddressToString_SingleValue() {
        // Arrange
        Channel channelMock = Mockito.mock(Channel.class);
        SocketAddress remoteAddressMock = Mockito.mock(SocketAddress.class);

        when(protocol.getChannel()).thenReturn(channelMock);
        when(protocol.getRemoteAddress()).thenReturn(remoteAddressMock);

        Object result = WatchProtocolDecoder.WatchProtocolDecoderInstance.decode(
                channelMock, remoteAddressMock, "12345");

        // Assert
        assertEquals("ChannelSocketAddress", result.getClass().getSimpleName());
    }

    @Test
    public void getHasIndex() {
        // Arrange
        Protocol protocolMock = Mockito.mock(Protocol.class);
        Mockito.when(protocolMock.getHasIndex()).thenReturn(true);

        WatchProtocolDecoderInstance watchProtocolDecoderInstance = new WatchProtocolDecoderInstance(protocolMock);

        Object result = WatchProtocolDecoder.WatchProtocolDecoderInstance.getHasIndex();

        // Assert
        assertEquals(true, result);
    }

    @Test
    public void getManufacturer() {
        // Arrange
        Protocol protocolMock = Mockito.mock(Protocol.class);
        Mockito.when(protocolMock.getManufacturer()).thenReturn("Unknown Manufacturer");

        WatchProtocolDecoderInstance watchProtocolDecoderInstance = new WatchProtocolDecoderInstance(protocolMock);

        Object result = WatchProtocolDecoder.WatchProtocolDecoderInstance.getManufacturer();

        // Assert
        assertEquals("Unknown Manufacturer", result);
    }

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

    @Test
    public void decodeChannelSocketAddressToStringMultipleMsg() {
        // Arrange
        Channel channelMock = Mockito.mock(Channel.class);
        SocketAddress remoteAddressMock = Mockito.mock(SocketAddress.class);

        when(protocol.getChannel()).thenReturn(channelMock);
        when(protocol.getRemoteAddress()).thenReturn(remoteAddressMock);

        Object result = WatchProtocolDecoder.WatchProtocolDecoderInstance.decode(
                channelMock, remoteAddressMock, "12345");

        // Assert
        assertEquals("ChannelSocketAddress", result.getClass().getSimpleName());
    }

}