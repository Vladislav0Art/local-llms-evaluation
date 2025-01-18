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

public class GeneratedDecodeWithNullChannelTest {

    private Protocol protocol = Mockito.mock(Protocol.class);

    @Test
    public void decodeWithNullChannelTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Object result = decoder.decode(null, new InetSocketAddress(80), "Test Message");
        Assert.assertNull(result);
    }

}