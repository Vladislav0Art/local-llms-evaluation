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

public class GeneratedDecodeTagRangeA0ToAfTest {

    @Test
    public void decodeTagRangeA0ToAfTest() throws UnsupportedEncodingException {
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer(new byte[]{0x01});
        decoder.decodeTag(position, buf, 0xA0);
        Assert.assertEquals(0x01, position.getInt("can8BitR15"));
    }

}