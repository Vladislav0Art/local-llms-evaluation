package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;

import java.nio.charset.StandardCharsets;
import java.net.SocketAddress;

public class GeneratedDecodeWithInvalidChannelTest {

    @Test
    public void decodeWithInvalidChannelTest() throws Exception {
        Protocol protocol = new Protocol("test");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        byte[] msg = new byte[]{ /* invalid data */};

        Object result = decoder.decode(channel, remoteAddress, msg);

        Assert.assertNull(result);
    }

}