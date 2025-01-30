package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.protocol.WatchProtocolDecoder;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        WatchProtocolDecoder decoder = Mockito.mock(WatchProtocolDecoder.class);
        Channel channel = Mockito.mock(Channel.class);
        String msg = "[3G*1234567890*000A*LK,100,100]";
        ByteBuf buff = Unpooled.copiedBuffer(msg, StandardCharsets.US_ASCII);
        Object obj = decoder.decode(channel, null, buff);

        assertNotNull(obj);
    }

}