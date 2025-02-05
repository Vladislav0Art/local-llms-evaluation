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
public class GeneratedDecodeExceptionTest {

    @Test
    public void decodeExceptionTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        ByteBuf buf = Unpooled.buffer();

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        try {
            Object result = decoder.decode(channel, remoteAddress, buf);
            Assert.assertNull(result); // should throw exception, hence this line should not be reached
        } catch (Exception e) {
            Assert.assertNotNull(e);
        }
    }

}