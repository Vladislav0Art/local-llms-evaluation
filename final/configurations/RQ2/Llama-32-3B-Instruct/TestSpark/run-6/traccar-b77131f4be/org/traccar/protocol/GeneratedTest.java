package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Protocol protocol;

    public List<BitBuffer> decodeList() {
        return new LinkedList<>();
    }

    @Test
    public void constructor_GalileoProtocolDecoderTest() {
        when(protocol).thenReturn(this.protocol);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        assertNotNull(decoder);
    }

    @Test
    public void decode_ChannelsNotFoundTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Object result = decoder.decode(Mockito.mock(Channel.class), Mockito.mock(SocketAddress.class), null);
        assertNull(result);
    }

    @Test
    public void decode_DevicesNotFoundTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Object result = decoder.decode(Mockito.mock(Channel.class), Mockito.mock(SocketAddress.class), Mockito.mock(DeviceSession.class));
        assertNull(result);
    }

    @Test
    public void decode_PositionFoundTest() throws Exception {
        when(protocol).thenReturn(this.protocol);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        DeviceSession deviceSession = Mockito.mock(DeviceSession.class);
        Position position = new Position();
        Map<String, String> properties = new HashMap<>();
        properties.put("timestamp", "2013-02-21 13:31:30");
        when(deviceSession.getProperties()).thenReturn(properties);

        List<BitBuffer> result = decodeList();
        BitBuffer bitBuffer = Mockito.mock(BitBuffer.class);
        result.add(bitBuffer);
        when(protocol.decode(channel, remoteAddress)).thenReturn(result);

        Object obj = decoder.decode(channel, remoteAddress, deviceSession);
        assertTrue(obj instanceof Position);
    }

    @Test
    public void decode_PositionNotFoundTest() throws Exception {
        when(protocol).thenReturn(this.protocol);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        DeviceSession deviceSession = Mockito.mock(DeviceSession.class);

        List<BitBuffer> result = decodeList();
        BitBuffer bitBuffer = Mockito.mock(BitBuffer.class);
        result.add(bitBuffer);
        when(protocol.decode(channel, remoteAddress)).thenReturn(result);

        Object obj = decoder.decode(channel, remoteAddress, deviceSession);
        assertNull(obj);
    }

    @Test
    public void decode_BitBufferNotFoundTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Object result = decoder.decode(Mockito.mock(Channel.class), Mockito.mock(SocketAddress.class), null);
        assertFalse(result instanceof BitBuffer);
    }

}