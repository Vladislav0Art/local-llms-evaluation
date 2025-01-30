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

public class GeneratedDecodeUdContentTest {

    @Test
    public void decodeUdContentTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = Mockito.mock(Channel.class);

        ByteBuf buffer = Unpooled.copiedBuffer("[3G*1234567890*004A*UD,160721082623,A,22.639580,N,114.020391,E,0.00,0.0,76.0,8,100,100,1,0,070000,460,0,9526,17431,BTS796]", StandardCharsets.US_ASCII);

        WatchProtocolDecoder spy = Mockito.spy(decoder);
        Mockito.doReturn(new org.traccar.session.DeviceSession(1L, "1234567890", protocol, channel, InetSocketAddress.createUnresolved("localhost", 0))).when(spy).getDeviceSession(any(), any(), any());

        Object decoded = spy.decode(channel, InetSocketAddress.createUnresolved("localhost", 0), buffer);

        assertNotNull(decoded);
        Position position = (Position) decoded;

        assertEquals(1L, position.getDeviceId());
        assertEquals(22.639580, position.getLatitude(), 0.00001d);
        assertEquals(114.020391, position.getLongitude(), 0.00001d);
        assertEquals(100, (int) position.getInteger(Position.KEY_BATTERY_LEVEL));
    }

}