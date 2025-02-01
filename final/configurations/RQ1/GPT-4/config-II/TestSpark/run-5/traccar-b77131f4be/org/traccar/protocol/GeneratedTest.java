package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void galileoProtocolDecoderConstructorTest() {
        Protocol protocol = mock(Protocol.class);
        assertNotNull(new GalileoProtocolDecoder(protocol));
    }

    @Test
    public void getTagLengthExceptionTest() {
        GalileoProtocolDecoder.getTagLength(0x00);
    }

    @Test
    public void getTagLengthTest() {
        assertEquals(1, GalileoProtocolDecoder.getTagLength(0x01));
        assertEquals(2, GalileoProtocolDecoder.getTagLength(0x04));
        assertEquals(3, GalileoProtocolDecoder.getTagLength(0x63));
        assertEquals(4, GalileoProtocolDecoder.getTagLength(0x20));
    }

    @Test
    public void sendResponseTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("gl200"));
        Channel channel = mock(Channel.class, RETURNS_DEEP_STUBS);
        decoder.sendResponse(channel, 0xFF, 0xFFFF);
        verify(channel, times(1)).writeAndFlush(any());
    }

    @Test
    public void decodeTagTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("gl200"));
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x01);
        Position position = new Position("dummyProtocol");

        decoder.decodeTag(position, buf, 0x01);
        assertEquals(1, position.get(Position.KEY_VERSION_HW));
    }

    @Test
    public void decodeTagOtherTest() {
        BundleContext context = mock(BundleContext.class);
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("gl200"), context);
        ByteBuf buf = Unpooled.buffer();
        buf.writeInt(2000);
        Position position = new Position("dummyProtocol");

        decoder.decodeTagOther(position, buf, 0x44);
        assertEquals(2000, position.get(Position.KEY_ACCELERATION));
    }

    @Test
    public void decodePositionsTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("gl200"));
        Channel channel = mock(Channel.class, RETURNS_DEEP_STUBS);
        SocketAddress remoteAddress = mock(SocketAddress.class);

        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x01);
        buf.writeShortLE(0);
        buf.writeByte(0x03);
        buf.writeCharSequence("123456789012345", StandardCharsets.US_ASCII);
        buf.writeByte(0x30);
        buf.writeByte(0x00);
        buf.writeInt((int) 51.1e6);
        buf.writeInt((int) 4.1e6);
        buf.writeByte(0x20);
        buf.writeInt((int) (System.currentTimeMillis() / 1000));
        buf.writeByte(0x02);
        buf.writeShortLE(0);
        List<Position> positions = decoder.decodePositions(channel, remoteAddress, buf);
        Position position = positions.get(0);

        assertEquals(51.1, position.getLatitude(), 0.01);
        assertEquals(4.1, position.getLongitude(), 0.01);
    }

    @Test
    public void decodeCompressedPositionsTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("gl200"));
        Channel channel = mock(Channel.class, RETURNS_DEEP_STUBS);
        SocketAddress remoteAddress = mock(SocketAddress.class);

        ByteBuf buf = Unpooled.buffer();
        buf.writeInt(1000);
        List<Position> positions = decoder.decodeCompressedPositions(channel, remoteAddress, buf);
        Position position = positions.get(0);

        assertEquals(new Date(1000), position.getFixTime());
    }

    @Test
    public void decodeMinimalDataSetTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new Protocol("gl200"));
        Position position = new Position("gl200");
        ByteBuf buf = Unpooled.buffer();
        buf.writeLong(1000);

        decoder.decodeMinimalDataSet(position, buf);
        assertEquals(new Date(1000), position.getFixTime());
    }

}