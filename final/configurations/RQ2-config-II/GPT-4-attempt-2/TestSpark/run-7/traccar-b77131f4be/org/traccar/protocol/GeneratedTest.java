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

public class GeneratedTest {

    @Test
    public void GalileoProtocolDecoderConstructorTest() {
        Protocol protocol = new Protocol("galileo", null, null, null);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Assert.assertNotNull(decoder);
    }

    @Test
    public void decodeNullChannelTest() throws Exception {
        Protocol protocol = new Protocol("galileo", null, null, null);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Object obj = decoder.decode(null, remoteAddress, "Test Message");

        Assert.assertNull(obj);
    }

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

    @Test
    public void decodeValidLocationTest() throws Exception {
        Protocol protocol = new Protocol("galileo", null, null, null);
        Channel channel = mock(Channel.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        byte[] message = "Sample Valid Message".getBytes(StandardCharsets.UTF_8);
        Object obj = decoder.decode(channel, remoteAddress, Unpooled.copiedBuffer(message));

        Assert.assertTrue(obj instanceof Position);
        Position position = (Position) obj;
        //Assert fields from the position here as per the valid message
        //...
    }

    @Test
    public void decodeInvalidLocationTest() throws Exception {
        Protocol protocol = new Protocol("galileo", null, null, null);
        Channel channel = mock(Channel.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        byte[] message = "Invalid Message for Location".getBytes(StandardCharsets.UTF_8);
        Object obj = decoder.decode(channel, remoteAddress, Unpooled.copiedBuffer(message));

        Assert.assertNull(obj);
    }

}