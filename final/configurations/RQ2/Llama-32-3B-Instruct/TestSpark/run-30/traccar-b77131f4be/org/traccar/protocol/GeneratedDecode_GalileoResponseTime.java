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

public class GeneratedDecode_GalileoResponseTime {

    @Mock
    private Protocol protocol;

    public void setupMock() {
        MockitoAnnotations.initMocks(this);
        protocol = mock(Protocol.class);
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

}