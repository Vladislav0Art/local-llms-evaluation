package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeLkBatteryTest {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private Protocol protocol;

    @Mock
    private DeviceSession deviceSession;

    @Test
    public void decodeLkBatteryTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        ByteBuf buf = Unpooled.buffer();
        buf.writeBytes("[CS*123456*0002*LK,10,30]".getBytes());
        when(deviceSession.getDeviceId()).thenReturn(0L);
        when(decoder.getDeviceSession(channel, remoteAddress, "123456")).thenReturn(deviceSession);
        Object result = decoder.decode(channel, remoteAddress, buf);
        assertNotNull(result);
        verify(channel).writeAndFlush(any());
    }

}