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

public class GeneratedDecodeCompressedPositionsTest {

    @Test
    public void decodeCompressedPositionsTest() throws UnsupportedEncodingException {
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        ByteBuf buf = Unpooled.copiedBuffer(new byte[]{0x02, 0x01, 0x04, 0x08, (byte) 0xff, 0x01});
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Channel channel = Mockito.mock(Channel.class);
        List<Position> positions = decoder.decodeCompressedPositions(channel, remoteAddress, buf);
        Assert.assertEquals(1, positions.size());
    }

}