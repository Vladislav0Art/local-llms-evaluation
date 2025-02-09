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

public class GeneratedDecodeNullChannelTest {

    @Test
    public void decodeNullChannelTest() throws Exception {
        Protocol protocol = new Protocol("galileo", null, null, null);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object obj = decoder.decode(null, remoteAddress, "Test Message");

        Assert.assertNull(obj);
    }

}