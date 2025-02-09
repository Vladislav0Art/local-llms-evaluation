package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

public class GeneratedTest {

    @Test
    public void decodeNullTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        Object decoded = decoder.decode(channel, remoteAddress, null);
        Assert.assertNull(decoded);
    }

    @Test
    public void decodeEmptyMessageTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        Object decoded = decoder.decode(channel, remoteAddress, "");
        Assert.assertNull(decoded);
    }

    @Test
    public void decodeValidMessageTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        // Generate some valid message
        String message = "Valid message";

        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        ByteBuf buf = Unpooled.copiedBuffer(message, StandardCharsets.US_ASCII);

        Object decoded = decoder.decode(channel, remoteAddress, buf);
        Assert.assertNotNull(decoded);
        Assert.assertTrue(decoded instanceof Position);
    }

}