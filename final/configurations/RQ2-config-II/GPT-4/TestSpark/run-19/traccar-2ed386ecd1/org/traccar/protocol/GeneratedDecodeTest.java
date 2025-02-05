package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.TimeZone;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        ByteBuf buffer = Unpooled.buffer();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress address = new InetSocketAddress("localhost", 8080);

        buffer.writeInt(1);
        buffer.writeInt(30);

        Assert.assertNull(decoder.decode(channel, address, buffer));
    }

}