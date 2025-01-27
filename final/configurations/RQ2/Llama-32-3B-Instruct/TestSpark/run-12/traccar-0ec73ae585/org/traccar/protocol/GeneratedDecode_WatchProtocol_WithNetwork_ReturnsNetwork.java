package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_WatchProtocol_WithNetwork_ReturnsNetwork {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Mock
    private Object msg;

    @Test
    public void decode_WatchProtocol_WithNetwork_ReturnsNetwork() {
        ByteBuf buffer = Unpooled.buffer();
        when(msg).thenReturn(buffer);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

        Object result = decoder.decode(channel, remoteAddress, msg);
        assertTrue(result instanceof Network);
    }

}