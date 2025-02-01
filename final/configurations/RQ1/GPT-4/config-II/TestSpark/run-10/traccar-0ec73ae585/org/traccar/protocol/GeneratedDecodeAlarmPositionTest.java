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
public class GeneratedDecodeAlarmPositionTest {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private Protocol protocol;

    @Mock
    private DeviceSession deviceSession;

    @Test
    public void decodeAlarmPositionTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        ByteBuf buf = Unpooled.buffer();
        String data = "[CS*123456*0002*ALT,250117,060310,A,50.437877,N,30.4844147,E,0.00,200.00,165,9,45,50,11,0,0,0,133]";
        buf.writeBytes(data.getBytes());
        when(deviceSession.getDeviceId()).thenReturn(0L);
        when(decoder.getDeviceSession(channel, remoteAddress, "123456")).thenReturn(deviceSession);
        Object result = decoder.decode(channel, remoteAddress, buf);
        assertNotNull(result);
        verify(channel).writeAndFlush(any());
    }

}