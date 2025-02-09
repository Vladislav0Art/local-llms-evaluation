package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import io.netty.buffer.Unpooled;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedDecodeWithChannelTest {

    @Test
    public void decodeWithChannelTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Unpooled.copiedBuffer("123456789", StandardCharsets.UTF_8);
        Object decoded = decoder.decode(channel, remoteAddress, msg);
        assertTrue(decoded instanceof Position);
    }

}