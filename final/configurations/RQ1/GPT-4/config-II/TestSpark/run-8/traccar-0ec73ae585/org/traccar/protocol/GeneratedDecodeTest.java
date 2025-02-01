package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;
import java.util.Date;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        final Channel channel = Mockito.mock(Channel.class);
        ByteBuf buf = Mockito.mock(ByteBuf.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);

        WatchProtocolDecoder decoder = Mockito.spy(new WatchProtocolDecoder(new Protocol("watch")));

        when(buf.readByte()).thenReturn((byte) 1);
        when(buf.readBytes(Mockito.any(ByteBuf.class), Mockito.anyInt())).thenReturn(buf);
        when(buf.toString(Mockito.anyInt(), Mockito.anyInt(), Mockito.any(Charset.class))).thenReturn("test");
        when(buf.readableBytes()).thenReturn(0);

        assertNull(decoder.decode(channel, remoteAddress, buf));

        verify(buf, Mockito.times(5)).skipBytes(Mockito.anyInt());
        verify(buf, Mockito.times(3)).readByte();
        verify(buf, Mockito.times(3)).readBytes(Mockito.any(ByteBuf.class), Mockito.anyInt());
        verify(buf, Mockito.times(2)).toString(Mockito.anyInt(), Mockito.anyInt(), Mockito.any(Charset.class));
    }

}