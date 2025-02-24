package org.traccar.protocol;

import static org.junit.Assert.assertNotNull;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;

public class GeneratedTestDecode {

    @Test
    public void testDecode() throws Exception {
        final WatchProtocolDecoder decoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        final Channel channel = Mockito.mock(Channel.class);
        final SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        final ByteBuf msg = Unpooled.copiedBuffer("Test message", StandardCharsets.UTF_8);

        assertNotNull(decoder.decode(channel, remoteAddress, msg));
    }

}