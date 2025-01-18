package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class GeneratedDecodeWithNullMsgTest {

    private Protocol protocol = Mockito.mock(Protocol.class);

    @Test
    public void decodeWithNullMsgTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Object result = decoder.decode(Mockito.mock(Channel.class), new InetSocketAddress(80), null);
        Assert.assertNull(result);
    }

}