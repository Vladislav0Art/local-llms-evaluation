package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;
import org.junit.Test;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodeTypeErrorTKTest {

    private Protocol protocol = new Protocol();
    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
    private ByteBuf buf = Unpooled.copiedBuffer("INIT,1", StandardCharsets.US_ASCII);
    private DeviceSession deviceSession = mock(DeviceSession.class);

    @Test
    public void decodeTypeErrorTKTest() throws Exception {
        Channel channel = mock(Channel.class);
        when(channel.writeAndFlush(any())).thenReturn(null);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        when(deviceSession.getDeviceId()).thenReturn(5L);
        Object result = decoder.decode(channel, remoteAddress, Unpooled.copiedBuffer("TK", StandardCharsets.US_ASCII));
        assertNull(result);
    }

}