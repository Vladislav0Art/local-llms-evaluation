package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.traccar.Protocol;

import java.net.SocketAddress;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTest {

    @Test
    public void decodeTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = new Object();

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        try {
            Object result = decoder.decode(channel, remoteAddress, msg);
            Assert.assertNotNull(result);
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

}