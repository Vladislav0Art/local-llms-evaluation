package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class GeneratedDecodeLkContentTest {

    @Test
    public void decodeLkContentTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = Mockito.mock(Channel.class);
        when(channel.writeAndFlush(any())).thenReturn(null);

        ByteBuf buffer = Unpooled.copiedBuffer("[3G*1234567890*00EF*LK,12,1,30]", StandardCharsets.US_ASCII);

        WatchProtocolDecoder spy = Mockito.spy(decoder);
        Mockito.doReturn(new org.traccar.session.DeviceSession(1L, "1234567890", protocol, channel, InetSocketAddress.createUnresolved("localhost", 0))).when(spy).getDeviceSession(any(), any(), any());

        Object decoded = spy.decode(channel, InetSocketAddress.createUnresolved("localhost", 0), buffer);

        assertNotNull(decoded);
        Position position = (Position) decoded;

        assertEquals(1L, position.getDeviceId());
        assertEquals(30, (int) position.getInteger(Position.KEY_BATTERY_LEVEL));
        assertEquals(12, (int) position.getInteger(Position.KEY_STEPS));
    }

}