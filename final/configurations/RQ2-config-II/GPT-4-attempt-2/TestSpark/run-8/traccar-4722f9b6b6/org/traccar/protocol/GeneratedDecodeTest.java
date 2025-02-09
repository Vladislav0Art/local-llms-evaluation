package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Protocol protocol = new Protocol("testProtocol");
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        Assert.assertNull(watchProtocolDecoder.decode(channel, null, "test message"));
        Assert.assertEquals("Returned decoded message does not match expected", "decoded message",
                watchProtocolDecoder.decode(channel, null, Unpooled.copiedBuffer("input message", StandardCharsets.UTF_8)));
    }

}