package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.mock;

public class GeneratedDecodeInvalidMessageTypeTest {

    @Test
    public void decodeInvalidMessageTypeTest() throws Exception {
        Protocol protocol = new Protocol("galileo", null, null, null);
        Channel channel = mock(Channel.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        byte[] message = "Invalid Message".getBytes(StandardCharsets.UTF_8);
        Object obj = decoder.decode(channel, remoteAddress, Unpooled.copiedBuffer(message));

        Assert.assertNull(obj);
    }

}