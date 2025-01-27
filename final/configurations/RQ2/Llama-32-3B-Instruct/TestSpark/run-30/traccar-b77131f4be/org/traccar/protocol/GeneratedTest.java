package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.traccar.BaseProtocolDecoder;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.helper.BitBuffer;
import org.traccar.helper.BitUtil;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

public class GeneratedTest {

    @Mock
    private Protocol protocol;

    public void setupMock() {
        MockitoAnnotations.initMocks(this);
        protocol = mock(Protocol.class);
    }

    @Test
    public void decode_GalileoResponse() throws Exception {
        setupMock();
        Channel channel = mock(Channel.class);
        Object msg = null;
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        ByteBuf response = Unpooled.buffer();
        when(channel.newMessage()).thenReturn(response);

        Object result = decoder.decode(channel, null, msg);
        assertNotNull(result);
    }

    @Test
    public void decode_GalileoNotAvailable() throws Exception {
        setupMock();
        Channel channel = mock(Channel.class);
        Object msg = null;
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        when(channel.newMessage()).thenReturn(Unpooled.buffer());

        Object result = decoder.decode(channel, null, msg);
        assertNull(result);
    }

    @Test
    public void decode_GalileoResponseNoPosition() throws Exception {
        setupMock();
        Channel channel = mock(Channel.class);
        Object msg = null;
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        ByteBuf response = Unpooled.buffer();
        when(channel.newMessage()).thenReturn(response);

        Object result = decoder.decode(channel, null, msg);
        assertNotNull(result);
    }

    @Test
    public void decode_GalileoResponsePosition() throws Exception {
        setupMock();
        Channel channel = mock(Channel.class);
        Object msg = null;
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        ByteBuf response = Unpooled.buffer();
        when(channel.newMessage()).thenReturn(response);

        BitBuffer position = BitUtil.createBitBuffer(12, 4);
        position.setBit(0, true);
        position.setBit(1, false);
        position.setBit(2, true);
        position.setBit(3, false);
        when(protocol.getMessage()).thenReturn(position);

        Object result = decoder.decode(channel, null, msg);
        assertNotNull(result);
    }

    @Test
    public void decode_GalileoResponseTime() throws Exception {
        setupMock();
        Channel channel = mock(Channel.class);
        Object msg = null;
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        ByteBuf response = Unpooled.buffer();
        when(channel.newMessage()).thenReturn(response);

        long time = 1546300800000L; // Jan 1, 2018 12:00 PM
        when(protocol.getMessage()).thenReturn(time);

        Object result = decoder.decode(channel, null, msg);
        assertNotNull(result);
    }

    @Test
    public void decode_GalileoResponseUnits() throws Exception {
        setupMock();
        Channel channel = mock(Channel.class);
        Object msg = null;
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        ByteBuf response = Unpooled.buffer();
        when(channel.newMessage()).thenReturn(response);

        UnitsConverter converter = mock(UnitsConverter.class);
        when(converter.convert(any())).thenReturn("km/h");
        when(protocol.getMessage()).thenReturn(converter);

        Object result = decoder.decode(channel, null, msg);
        assertNotNull(result);
    }

    @Test
    public void decode_GalileoResponseNotPosition() throws Exception {
        setupMock();
        Channel channel = mock(Channel.class);
        Object msg = null;
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        ByteBuf response = Unpooled.buffer();
        when(channel.newMessage()).thenReturn(response);

        // assuming this is not an available message
        // in a real implementation you should have your own logic to check if it's available
        boolean available = false;
        when(protocol.isAvailable()).thenReturn(available);

        Object result = decoder.decode(channel, null, msg);
        assertNotNull(result);
    }

    @Test
    public void decode_GalileoResponseNotMessage() throws Exception {
        setupMock();
        Channel channel = mock(Channel.class);
        Object msg = null;
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        assertNotEquals(null, decoder.decode(channel, null, msg));
    }

}