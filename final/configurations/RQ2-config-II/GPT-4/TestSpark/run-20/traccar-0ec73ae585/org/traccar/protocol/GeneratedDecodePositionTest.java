package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodePositionTest {

    @Test
    public void decodePositionTest() throws Exception {
        String testMsg = "[SG*8800000015*0004*LK]";
        Protocol protocol = new Protocol("test");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        InetSocketAddress address = new InetSocketAddress(0);

        Channel channel = mock(Channel.class);
        when(channel.writeAndFlush(any())).thenReturn(null);

        Position position = (Position) decoder.decode(channel, address, testMsg);
        assertNotNull(position);
        assertEquals(position.getDeviceId(), 8800000015L);
    }

}