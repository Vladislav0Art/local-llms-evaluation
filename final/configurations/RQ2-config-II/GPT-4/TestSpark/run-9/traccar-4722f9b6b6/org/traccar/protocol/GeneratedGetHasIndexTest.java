package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.buffer.ByteBuf;
import org.traccar.Protocol;

public class GeneratedGetHasIndexTest {

    private Channel channel = Mockito.mock(Channel.class);
    private Protocol protocol = Mockito.mock(Protocol.class);

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertFalse(decoder.getHasIndex());
    }

}