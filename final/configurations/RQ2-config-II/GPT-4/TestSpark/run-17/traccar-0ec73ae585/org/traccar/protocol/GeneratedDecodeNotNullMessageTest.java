package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;

public class GeneratedDecodeNotNullMessageTest {

    @Test
    public void decodeNotNullMessageTest() throws Exception {
        Protocol protocol = new Protocol("protocol");
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Channel channel = Mockito.mock(Channel.class);

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        String msg = "not null message";

        Object result = decoder.decode(channel, remoteAddress, msg);
        Assert.assertTrue(result instanceof Position);
    }

}