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

public class GeneratedTest {

    @Test
    public void decodeTagLengthTest() {
        try {
            GalileoProtocolDecoder.getTagLength(0x3A);
        } catch (IllegalArgumentException e) {
            assert (e.getMessage().equals("Unknown tag: 0x3a"));
        }
    }

    @Test
    public void decodeMinimalDataSetTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol());
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("0189012e03380038003800780078007800", StandardCharsets.UTF_8);
        decoder.decodeMinimalDataSet(position, buf);

        assert (position.getFixTime() != null);
    }

    @Test
    public void decodeTagTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol());
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("01020304", StandardCharsets.UTF_8);
        decoder.decodeTag(position, buf, 0x01);

        assert (position.get(Position.KEY_VERSION_HW) != null);
        assert ((int) position.get(Position.KEY_VERSION_HW) == 1);
    }

    @Test
    public void sendResponseTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol());

        Channel channel = mock(Channel.class);
        when(channel.remoteAddress()).thenReturn(mock(SocketAddress.class));

        decoder.sendResponse(channel, 0x01, 200);

        verify(channel).writeAndFlush(new NetworkMessage(Unpooled.buffer(3).writeByte(0x01).writeShortLE((short) 200), channel.remoteAddress()));
    }

}