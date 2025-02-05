package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        // Given
        Protocol protocol = Mockito.mock(Protocol.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Channel channel = Mockito.mock(Channel.class);
        InetSocketAddress remoteAddress = InetSocketAddress.createUnresolved("localhost", 8000);
        ByteBuf msg = Unpooled.wrappedBuffer("Mock message".getBytes());

        // When
        Object result = decoder.decode(channel, remoteAddress, msg);

        // Then
        Assert.assertTrue(result instanceof Position);
    }

}