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

public class GeneratedDecodeTagRange50To57Test {

    @Test
    public void decodeTagRange50To57Test() throws UnsupportedEncodingException {
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer(new byte[]{0x01, 0x02});
        decoder.decodeTag(position, buf, 0x50);
        Assert.assertEquals(0x102, position.getInt(Position.PREFIX_ADC + 0));
    }

}