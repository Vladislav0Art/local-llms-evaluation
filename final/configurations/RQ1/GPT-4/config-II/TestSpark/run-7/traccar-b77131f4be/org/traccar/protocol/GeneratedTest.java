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

public class GeneratedTest {

    @Test
    public void decodeTagRange50To57Test() throws UnsupportedEncodingException {
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer(new byte[]{0x01, 0x02});
        decoder.decodeTag(position, buf, 0x50);
        Assert.assertEquals(0x102, position.getInt(Position.PREFIX_ADC + 0));
    }

    @Test
    public void decodeTagRangeA0ToAfTest() throws UnsupportedEncodingException {
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer(new byte[]{0x01});
        decoder.decodeTag(position, buf, 0xA0);
        Assert.assertEquals(0x01, position.getInt("can8BitR15"));
    }

    @Test
    public void decodeTagOtherCase01Test() throws UnsupportedEncodingException {
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer(new byte[]{0x01});
        decoder.decodeTagOther(position, buf, 0x01);
        Assert.assertEquals(0x01, position.getInt(Position.KEY_VERSION_HW));
    }

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

    @Test
    public void decodePhotoTest() throws UnsupportedEncodingException {
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        ByteBuf buf = Unpooled.copiedBuffer(new byte[]{0x01, 0x07, 0x01, 0x02});
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Channel channel = Mockito.mock(Channel.class);
        Position position = (Position) decoder.decodePhoto(channel, remoteAddress, buf);
        Assert.assertEquals(null, position);
    }

    @Test
    public void decodeTest() throws UnsupportedEncodingException {
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        ByteBuf buf = Unpooled.copiedBuffer(new byte[]{0x01, 0x02, 0x03, 0x04, 0x01});
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Channel channel = Mockito.mock(Channel.class);
        List<Position> positions = (List<Position>) decoder.decode(channel, remoteAddress, buf);
        Assert.assertNotNull(positions);
    }

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