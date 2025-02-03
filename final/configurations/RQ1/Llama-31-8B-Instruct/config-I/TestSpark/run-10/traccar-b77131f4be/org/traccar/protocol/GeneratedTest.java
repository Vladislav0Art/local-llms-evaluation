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

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    public GalileoProtocolDecoder decoder;

    @Mock
    private Protocol protocol;

    @Mock
    private io.netty.channel.Channel channel;

    @Mock
    private java.net.SocketAddress remoteAddress;

    @Mock
    private ByteBuf buf;

    @Test
    public void testDecodeMinimalDataSet() {
        Position position = new Position("Galileo");
        decoder.decodeMinimalDataSet(position, buf);
        assertEquals(1, position.getValid());
        assertEquals(0, position.getLatitude());
        assertEquals(0, position.getLongitude());
    }

    @Test
    public void testDecodeIridiumPosition() {
        DeviceSession deviceSession = new DeviceSession(0L, "deviceId", protocol, channel, remoteAddress);
        when(GalileoProtocolDecoder.getDeviceSession(channel, remoteAddress, any(String.class))).thenReturn(deviceSession);
        Position position = decoder.decodeIridiumPosition(channel, remoteAddress, buf);
        assertNotNull(position);
        assertEquals(deviceSession.getDeviceId(), position.getDeviceId());
    }

    @Test
    public void testDecodePositions() {
        DeviceSession deviceSession = new DeviceSession(0L, "deviceId", protocol, channel, remoteAddress);
        when(GalileoProtocolDecoder.getDeviceSession(channel, remoteAddress)).thenReturn(deviceSession);
        List<Position> positions = decoder.decodePositions(channel, remoteAddress, buf);
        assertNotNull(positions);
        assertEquals(1, positions.size());
        assertEquals(deviceSession.getDeviceId(), positions.get(0).getDeviceId());
    }

}