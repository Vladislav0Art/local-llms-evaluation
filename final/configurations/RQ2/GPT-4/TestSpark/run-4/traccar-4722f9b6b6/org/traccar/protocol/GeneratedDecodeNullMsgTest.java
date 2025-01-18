package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.BaseProtocol;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class GeneratedDecodeNullMsgTest {

    @Test
    public void decodeNullMsgTest() throws Exception {
        BaseProtocol protocol = Mockito.mock(BaseProtocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = Mockito.mock(Channel.class);
        Object result = decoder.decode(channel, new InetSocketAddress("localhost", 8080), null);

        Assert.assertNull(result);
    }

}