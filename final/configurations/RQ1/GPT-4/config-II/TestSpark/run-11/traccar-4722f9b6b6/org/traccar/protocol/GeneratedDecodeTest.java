package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;

import static org.junit.Assert.*;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Protocol protocol = new Protocol("test");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Channel channel = Mockito.mock(Channel.class);
        Mockito.when(channel.remoteAddress()).thenReturn(remoteAddress);
        Mockito.when(channel.writeAndFlush(Mockito.any())).thenReturn(null);
        ByteBuf buf = Unpooled.copiedBuffer("[3g*12345678*0002*LK]", StandardCharsets.US_ASCII);

        Object decoded = decoder.decode(channel, remoteAddress, buf);

        assertEquals("test", ((Position) decoded).getProtocol());
    }

}