package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.traccar.model.Position;

import java.net.SocketAddress;

public class GeneratedDecodeInvalidIndexTest {

    private WatchProtocolDecoder decoder =
            new WatchProtocolDecoder(Protocol.getInstance("WATCH", "watch", null));

    @Test
    public void decodeInvalidIndexTest() {
        String id = "355626078698504";
        int txInt = 2;
        String message = "[3g*355626078698504*0344*AD]";
        Channel channel = Mockito.mock(Channel.class);
        Mockito.when(channel.writeAndFlush(any())).thenAnswer(
                invocation -> invocation.getArgumentAt(0, ByteBuf.class).release());

        ByteBuf buf = Unpooled.buffer();
        buf.setByte(0, txInt);
        decoder.decode(channel, null, buf);
        ArgumentCaptor<Object> captor = ArgumentCaptor.forClass(Object.class);
        verify(channel).writeAndFlush(captor.capture());

        ByteBuf result = (ByteBuf) captor.getValue();
        assertEquals("AD", result.toString(StandardCharsets.UTF_8));
    }

}