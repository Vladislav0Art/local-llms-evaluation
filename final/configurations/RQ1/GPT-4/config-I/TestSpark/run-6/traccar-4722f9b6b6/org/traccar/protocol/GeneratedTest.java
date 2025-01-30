package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private DeviceSession deviceSession;

    @Test
    public void decodeInitTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        ByteBuf buf = Unpooled.wrappedBuffer("[CS*123456*000F*INIT".getBytes());

        when(decoder.getDeviceSession(channel, remoteAddress, "123456")).thenReturn(deviceSession);

        assertNull(decoder.decode(channel, remoteAddress, buf));
    }

    @Test
    public void decodeLkTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        ByteBuf buf = Unpooled.wrappedBuffer("[CS*123456*000C*LK,100,80".getBytes());

        when(decoder.getDeviceSession(channel, remoteAddress, "123456")).thenReturn(deviceSession);

        Position position = (Position) decoder.decode(channel, remoteAddress, buf);
        assertNotNull(position);
    }

    @Test
    public void decodeUdTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        ByteBuf buf = Unpooled.wrappedBuffer("[CS*123456*000A*UD,00002".getBytes());

        when(decoder.getDeviceSession(channel, remoteAddress, "123456")).thenReturn(deviceSession);

        assertNull(decoder.decode(channel, remoteAddress, buf));
    }

}