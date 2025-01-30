package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodePositionTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private DeviceSession deviceSession;

    @Test
    public void decodePositionTest() {
        String data = "191109135059,A,35.857618,N,14.471806,E,0.00,0.00,0.00,8,13,4,0,00000000,1,475,14404892299,8";
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Position position = decoder.decodePosition(deviceSession, data);

        assertNotNull(position);
        assertEquals(deviceSession.getDeviceId(), position.getDeviceId());
        assertTrue(position.getValid());
        assertEquals(35.857618, position.getLatitude(), 0.00001);
        assertEquals(14.471806, position.getLongitude(), 0.00001);
    }

}