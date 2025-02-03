package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.BaseProtocolDecoder;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestDecodePositions {

    @InjectMocks
    public GalileoProtocolDecoder decoder;

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private ByteBuf buf;

    @Test
    public void testDecodePositions() {
        DeviceSession deviceSession = new DeviceSession(123L, "deviceId", null, channel, remoteAddress);
        when(getDeviceSession(channel, remoteAddress)).thenReturn(deviceSession);
        List<Position> positions = decoder.decodePositions(channel, remoteAddress, Unpooled.buffer(10));
        assertNotNull(positions);
        assertEquals(1, positions.size());
        assertEquals(deviceSession.getDeviceId(), positions.get(0).getDeviceId());
    }

}