package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class GeneratedDecodeInvalidContentTest {

    @Test
    public void decodeInvalidContentTest() throws Exception {
        ByteBuf msg = Unpooled.wrappedBuffer("[CS*0123456789*SIM]".getBytes(StandardCharsets.US_ASCII));
        Channel channel = Mockito.mock(Channel.class);
        InetSocketAddress remoteAddress = Mockito.mock(InetSocketAddress.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Object result = decoder.decode(channel, remoteAddress, msg);
        Assert.assertNull(result);
    }

}