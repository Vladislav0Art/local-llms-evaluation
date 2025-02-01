package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.embedded.EmbeddedChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.ProtocolTest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        WatchProtocol protocol = new WatchProtocol();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        EmbeddedChannel channel = new EmbeddedChannel(new LengthFieldBasedFrameDecoder(2, 0, 2, 0, 2));
        decoder.decode(channel, null, Unpooled.wrappedBuffer(new byte[]{0x00}));
        Assert.assertNull(channel.readOutbound());

        channel = new EmbeddedChannel(new LengthFieldBasedFrameDecoder(2, 0, 2, 0, 2));
        decoder.decode(channel, null, Unpooled.wrappedBuffer(new byte[]{0x01}));
        Assert.assertNull(channel.readOutbound());
    }

}