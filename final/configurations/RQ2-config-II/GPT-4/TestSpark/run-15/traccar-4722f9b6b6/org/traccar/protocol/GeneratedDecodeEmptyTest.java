package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedDecodeEmptyTest {

    @Test
    public void decodeEmptyTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        ByteBuf msg = Unpooled.buffer(0);

        Object result = decoder.decode(channel, remoteAddress, msg);

        assertEquals(null, result);
    }

}