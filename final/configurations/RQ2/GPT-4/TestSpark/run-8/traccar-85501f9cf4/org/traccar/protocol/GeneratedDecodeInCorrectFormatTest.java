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
import java.time.ZoneId;
import java.util.TimeZone;

public class GeneratedDecodeInCorrectFormatTest {

    private Gt06ProtocolDecoder gT06ProtocolDecoder;
    private static final Protocol PROTOCOL = Mockito.mock(Protocol.class);

    @Test
    public void decodeInCorrectFormatTest() throws Exception {
        gT06ProtocolDecoder = new Gt06ProtocolDecoder(PROTOCOL);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = "abc";
        Object decode = gT06ProtocolDecoder.decode(channel, remoteAddress, msg);
        Assert.assertNull(decode);
    }

}