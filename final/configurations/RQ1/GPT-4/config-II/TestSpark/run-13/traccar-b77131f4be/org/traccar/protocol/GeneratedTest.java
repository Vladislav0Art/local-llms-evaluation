package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.model.Position;
import org.traccar.protocol.GalileoProtocolDecoder;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void decodeMinimalDataSetTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(null);
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        ByteBuf buf = Unpooled.buffer().writeInt(1);
        Position position = new Position();
        try {
            decoder.decode(channel, remoteAddress, buf);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertTrue(position.getValid());
    }

    @Test
    public void decodeTagOtherTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(null);
        ByteBuf buf = Unpooled.buffer();
        Position position = new Position();
        decoder.decodeTagOther(position, buf, 0x01);
        assertEquals(position.getAttributes().get(Position.KEY_VERSION_HW), 0, 0);
    }

    @Test
    public void decodeTagOtherTest2() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(null);
        ByteBuf buf = Unpooled.buffer();
        Position position = new Position();
        decoder.decodeTagOther(position, buf, 0x02);
        assertEquals(position.getAttributes().get(Position.KEY_VERSION_FW), 0, 0);
    }

    @Test
    public void getTagLengthTest() {
        int length = GalileoProtocolDecoder.getTagLength(0x01);
        assertEquals(length, 1, 0);
    }

    @Test
    public void getTagLengthExceptionTest() {
        try {
            GalileoProtocolDecoder.getTagLength(0);
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
        }
    }

    @Test
    public void sendResponseTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(null);
        Channel channel = Mockito.mock(Channel.class);
        decoder.sendResponse(channel, 1, 1);
        verify(channel, times(1)).writeAndFlush(any());
    }

    @Test
    public void decodeTagTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(null);
        ByteBuf buf = Unpooled.buffer();
        Position position = new Position();
        decoder.decodeTag(position, buf, 0x01);
        assertTrue(position.getAttribute(Position.PREFIX_ADC + 0) instanceof Integer);
    }

    @Test
    public void decodeTest() throws Exception {
        GalileoProtocolDecoder decoder = spy(new GalileoProtocolDecoder(null));
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        ByteBuf buf = Unpooled.buffer().writeByte(0x01);
        Position returnPosition = new Position();
        doReturn(returnPosition).when(decoder).decodePositions(any(), any(), any());
        Position decodePosition = (Position) decoder.decode(channel, remoteAddress, buf);
        assertSame(returnPosition, decodePosition);
    }

    @Test
    public void decodeIridiumPositionTest() throws Exception {
        GalileoProtocolDecoder decoder = spy(new GalileoProtocolDecoder(null));
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        ByteBuf buf = Unpooled.buffer().writeShortLE(2).writeInt(1);
        DeviceSession session = Mockito.mock(DeviceSession.class);
        doReturn(session).when(decoder).getDeviceSession(any(), any(), anyString());
        Position position = (Position) decoder.decodeIridiumPosition(channel, remoteAddress, buf);
        assertNotNull(position);
    }

    @Test
    public void decodePositionsTest() throws Exception {
        GalileoProtocolDecoder decoder = spy(new GalileoProtocolDecoder(null));
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        ByteBuf buf = Unpooled.buffer().writeShortLE(2).writeInt(1);
        DeviceSession session = Mockito.mock(DeviceSession.class);
        doReturn(session).when(decoder).getDeviceSession(any(), any(), anyString());
        Object object = decoder.decodePositions(channel, remoteAddress, buf);
        assertTrue(object instanceof List);
    }

}