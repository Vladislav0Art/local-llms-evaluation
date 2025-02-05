package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Protocol protocol = new Protocol();
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Gt06ProtocolDecoder gt06ProtocolDecoder = new Gt06ProtocolDecoder(protocol);

        ByteBuf msg = Unpooled.copiedBuffer("1234567890".getBytes(StandardCharsets.UTF_8));
        Assert.assertNull(gt06ProtocolDecoder.decode(channel, remoteAddress, msg));

        ByteBuf msgEmpty = Unpooled.copiedBuffer("".getBytes(StandardCharsets.UTF_8));
        Assert.assertNull(gt06ProtocolDecoder.decode(channel, remoteAddress, msgEmpty));
    }

}