package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class GeneratedTest {

    Protocol protocol = Mockito.mock(Protocol.class);
    GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

    @Test
    public void decodeValidDataTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        String testMsg = "Test message";
        ByteBuffer buffer = ByteBuffer.allocate(testMsg.length());
        buffer.put(testMsg.getBytes(StandardCharsets.UTF_8));

        Object decodedObj = decoder.decode(channel, remoteAddress, buffer.array());

        Assert.assertTrue(decodedObj instanceof Position);
    }

    @Test
    public void decodeEmptyDataTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        ByteBuffer buffer = ByteBuffer.allocate(0);

        Object decodedObj = decoder.decode(channel, remoteAddress, buffer.array());

        Assert.assertNull(decodedObj);
    }

    @Test
    public void decodeNullTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        Object decodedObj = decoder.decode(channel, remoteAddress, null);

        Assert.assertNull(decodedObj);
    }

    @Test
    public void decodeInvalidDataTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        String testMsg = "Invalid message";
        ByteBuffer buffer = ByteBuffer.allocate(testMsg.length());
        buffer.put(testMsg.getBytes(StandardCharsets.UTF_8));

        Object decodedObj = decoder.decode(channel, remoteAddress, buffer.array());

        Assert.assertNull(decodedObj);
    }

    @Test
    public void decodeUnsupportedDataTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        Integer unsupportedData = Integer.valueOf(1);

        Object decodedObj = decoder.decode(channel, remoteAddress, unsupportedData);

        Assert.assertNull(decodedObj);
    }

}