package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedDecodeTest {

    private Gt06ProtocolDecoder getDecoder() {
        Protocol protocol = new Protocol("gt06");
        return new Gt06ProtocolDecoder(protocol);
    }

    @Test
    public void decodeTest() throws Exception {
        ByteBuf buf = Unpooled.copiedBuffer("1234567890".getBytes(StandardCharsets.UTF_8));
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress socketAddress = new InetSocketAddress("localhost", 80);

        Assert.assertEquals("1234567890", getDecoder().decode(channel, socketAddress, buf).toString());
    }

}