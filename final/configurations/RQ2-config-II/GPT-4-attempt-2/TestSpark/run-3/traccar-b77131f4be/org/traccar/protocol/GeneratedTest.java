package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void decodeValidDataTest() throws Exception {
        // set up
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 5000);
        Channel channel = Mockito.mock(Channel.class);
        ByteBuf buf = Unpooled.copiedBuffer("SOME VALID DATA", "UTF-8"); // put the valid data here
        Position position = new Position();

        // mock
        when(channel.remoteAddress()).thenReturn(remoteAddress);

        // action
        Position result = (Position) decoder.decode(channel, remoteAddress, buf.toString());

        // verify
        Assert.assertNotNull(result);
        // Assert.assertEquals(position, result);
        // Uncomment and set the properties to be expected in the position
    }

    @Test
    public void decodeInvalidDataTest() throws Exception {
        // set up
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        SocketAddress remoteAddress = new InetSocketAddress("localhost", 5000);
        Channel channel = Mockito.mock(Channel.class);
        ByteBuf buf = Unpooled.copiedBuffer("SOME INVALID DATA", "UTF-8"); // put the invalid data here

        // mock
        when(channel.remoteAddress()).thenReturn(remoteAddress);

        // action
        Object result = decoder.decode(channel, remoteAddress, buf.toString());

        // verify
        Assert.assertNull(result);
    }

}