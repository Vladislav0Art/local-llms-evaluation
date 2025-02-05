package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import io.netty.channel.Channel;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("test", StandardCharsets.UTF_8);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress address = Mockito.mock(SocketAddress.class);
        Gt06ProtocolDecoder decoder = Mockito.spy(new Gt06ProtocolDecoder(Mockito.mock(Protocol.class)));

        Object result = decoder.decode(channel, address, buf.toString(StandardCharsets.UTF_8));

        Assert.assertTrue(result instanceof Position);
    }

}