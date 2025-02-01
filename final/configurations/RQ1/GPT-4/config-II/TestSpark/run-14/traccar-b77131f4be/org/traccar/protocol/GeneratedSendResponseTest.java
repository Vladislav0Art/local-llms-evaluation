package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.model.Position;
import org.traccar.Protocol;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedSendResponseTest {

    @Test
    public void sendResponseTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol());

        Channel channel = mock(Channel.class);
        when(channel.remoteAddress()).thenReturn(mock(SocketAddress.class));

        decoder.sendResponse(channel, 0x01, 200);

        verify(channel).writeAndFlush(new NetworkMessage(Unpooled.buffer(3).writeByte(0x01).writeShortLE((short) 200), channel.remoteAddress()));
    }

}