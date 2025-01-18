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

public class GeneratedDecodeNullAddressTest {

    @Test
    public void decodeNullAddressTest() throws Exception {
        BaseProtocol protocol = Mockito.mock(BaseProtocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        ByteBuf buf = Unpooled.copiedBuffer("1234567890", StandardCharsets.US_ASCII);
        Channel channel = Mockito.mock(Channel.class);
        Object result = decoder.decode(channel, null, buf);

        Assert.assertNotNull(result);
    }

}