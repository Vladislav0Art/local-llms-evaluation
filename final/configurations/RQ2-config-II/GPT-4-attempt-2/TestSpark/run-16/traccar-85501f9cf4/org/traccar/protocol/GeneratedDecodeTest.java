package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void decodeTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);

        ByteBuf buf = Unpooled.copiedBuffer("78781f120f021e04260fb500000000000c46658a0a0908a6040207ac037e61550d0a0d0a",
                StandardCharsets.ISO_8859_1);
        String expectedResponse = "(01)";

        Mockito.when(channel.writeAndFlush(Mockito.any())).thenReturn(null);
        Mockito.when(channel.remoteAddress()).thenReturn(remoteAddress);

        decoder.decode(channel, remoteAddress, buf);

        Mockito.verify(channel).writeAndFlush(Mockito.any());
    }

}