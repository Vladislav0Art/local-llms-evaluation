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

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestDecodeIridiumPosition {

    @InjectMocks
    public GalileoProtocolDecoder decoder;

    @Mock
    private Protocol protocol;

    @Mock
    private io.netty.channel.Channel channel;

    @Mock
    private java.net.SocketAddress remoteAddress;

    @Mock
    private io.netty.buffer.ByteBuf buf;

    @Test
    public void testDecodeIridiumPosition() {
        io.netty.channel.Channel channel = io.netty.channel.nio.NioEventLoopGroup.newChannel();
        java.net.SocketAddress remoteAddress = new InetSocketAddress("localhost", 8080);
        DeviceSession deviceSession = new DeviceSession(0, "deviceId", null, channel, remoteAddress);
        when(getDeviceSession(channel, remoteAddress, any(String.class))).thenReturn(deviceSession);
        Position position = decoder.decodeIridiumPosition(channel, remoteAddress, Unpooled.buffer(10));
        assertNotNull(position);
        assertEquals(deviceSession.getDeviceId(), position.getDeviceId());
    }

}