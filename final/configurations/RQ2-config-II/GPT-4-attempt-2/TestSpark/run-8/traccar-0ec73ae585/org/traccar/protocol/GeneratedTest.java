package org.traccar.protocol;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.protocol.WatchProtocolDecoder;

import java.net.SocketAddress;
import java.nio.channels.Channel;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void WatchProtocolDecoderConstructorTest() {
        Protocol protocolMock = mock(Protocol.class);
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocolMock);
        assertNotNull(watchProtocolDecoder);
    }

    @Test
    public void getHasIndexDefaultTest() {
        Protocol protocolMock = mock(Protocol.class);
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocolMock);
        assertFalse(watchProtocolDecoder.getHasIndex());
    }

    @Test
    public void getManufacturerDefaultTest() {
        Protocol protocolMock = mock(Protocol.class);
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocolMock);
        assertNull(watchProtocolDecoder.getManufacturer());
    }

    @Test
    public void decodeNullChannelTest() throws Exception {
        Protocol protocolMock = mock(Protocol.class);
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocolMock);
        SocketAddress socketAddressMock = mock(SocketAddress.class);
        expectedException.expect(Exception.class);
        watchProtocolDecoder.decode(null, socketAddressMock, "Test Message");
    }

    @Test
    public void decodeNullSocketAddressTest() throws Exception {
        Protocol protocolMock = mock(Protocol.class);
        Channel channelMock = mock(Channel.class);
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocolMock);
        expectedException.expect(Exception.class);
        watchProtocolDecoder.decode(channelMock, null, "Test Message");
    }

    @Test
    public void decodeNullMessageTest() throws Exception {
        Protocol protocolMock = mock(Protocol.class);
        Channel channelMock = mock(Channel.class);
        SocketAddress socketAddressMock = mock(SocketAddress.class);
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocolMock);
        expectedException.expect(Exception.class);
        watchProtocolDecoder.decode(channelMock, socketAddressMock, null);
    }

    @Test
    public void decodeValidInputTest() throws Exception {
        Protocol protocolMock = mock(Protocol.class);
        Channel channelMock = mock(Channel.class);
        SocketAddress socketAddressMock = mock(SocketAddress.class);
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocolMock);
        Object obj = watchProtocolDecoder.decode(channelMock, socketAddressMock, "Test Message");
        assertNotNull(obj);
    }

}