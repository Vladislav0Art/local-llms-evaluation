package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        when(protocol.getDeviceSession(any(), any())).thenReturn(null);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        ByteBuf buf = Unpooled.copiedBuffer("#1,1,V,A,0,122.433269,37.556769,222.00,0.000,0,800,27467780,27489400,24422500,33340000,33341600,33375500,33377100,255,255,65535,R*55\r\n", StandardCharsets.US_ASCII);

        Position position = (Position) decoder.decode(null, new InetSocketAddress("localhost", 0), buf);

        assertEquals(37.556769, position.getLatitude(), 0.00001);
        assertEquals(122.433269, position.getLongitude(), 0.00001);
    }

}