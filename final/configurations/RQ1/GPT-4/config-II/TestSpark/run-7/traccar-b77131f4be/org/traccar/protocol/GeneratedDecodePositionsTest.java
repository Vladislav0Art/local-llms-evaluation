package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.io.UnsupportedEncodingException;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedDecodePositionsTest {

    @Test
    public void decodePositionsTest() throws UnsupportedEncodingException {
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        ByteBuf buf = Unpooled.copiedBuffer(new byte[]{(byte) 0xB4, 0x11, 0x03, (byte) 0xE8, 0x30, 0x00, 0x02, 0x31, 0x03, 0x04, 0x01, 0x00, 0x01});
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Channel channel = Mockito.mock(Channel.class);
        List<Position> positions = decoder.decodePositions(channel, remoteAddress, buf);
        Assert.assertEquals(1, positions.size());
    }

}