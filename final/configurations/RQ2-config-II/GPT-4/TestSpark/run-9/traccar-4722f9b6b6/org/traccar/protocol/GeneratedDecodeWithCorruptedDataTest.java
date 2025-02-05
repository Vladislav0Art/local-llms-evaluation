package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.buffer.ByteBuf;
import org.traccar.Protocol;

public class GeneratedDecodeWithCorruptedDataTest {

    private Channel channel = Mockito.mock(Channel.class);
    private Protocol protocol = Mockito.mock(Protocol.class);

    @Test
    public void decodeWithCorruptedDataTest() throws Exception {
        ByteBuf buf = Unpooled.copiedBuffer("corrupted data", StandardCharsets.US_ASCII);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertNull(decoder.decode(channel, null, buf));
    }

}