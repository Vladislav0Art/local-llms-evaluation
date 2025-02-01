package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private static final String DEVICE_IDENTIFICATION = "123456789012345";

    @Test
    public void decodeTagTest() {
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Position actualPosition = new Position();
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x0f);

        decoder.decodeTag(actualPosition, buf, 0x01);
        assertEquals(15, (int) actualPosition.getAttributes().get(Position.KEY_VERSION_HW));
    }

    @Test
    public void decodeTagOtherTest() {
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        Position actualPosition = new Position();
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x13);

        decoder.decodeTagOther(actualPosition, buf, 0x01);
        assertEquals(19, (int) actualPosition.getAttributes().get(Position.KEY_VERSION_HW));
    }

    @Test
    public void decodePositionsTest() throws Exception {
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        ByteBuf buf = Unpooled.buffer();
        buf.writeByte(0x03);
        buf.writeCharSequence(DEVICE_IDENTIFICATION, StandardCharsets.US_ASCII);
        buf.writeByte(0x30);
        buf.writeByte(0x00);
        buf.writeIntLE(2000000);
        buf.writeIntLE(2000000);
        buf.writeByte(0x20);
        buf.writeIntLE(1546300800);

        Channel channel = mock(Channel.class);
        SocketAddress address = mock(SocketAddress.class);

        List<Position> actualPositionList = decoder.decodePositions(channel, address, buf);

        assertNotNull(actualPositionList);
        assertEquals(1, actualPositionList.size());
        assertEquals(DEVICE_IDENTIFICATION, actualPositionList.get(0).getDeviceId());
        assertEquals(20.0, actualPositionList.get(0).getLatitude(), 0.01);
        assertEquals(20.0, actualPositionList.get(0).getLongitude(), 0.01);
    }

    @Test
    public void decodeCompressedPositionsTest() throws Exception {
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        ByteBuf buf = Unpooled.buffer();
        buf.writeShortLE(2);
        buf.writeByte(0x34);
        buf.writeByte(0x20);
        Channel channel = mock(Channel.class);
        SocketAddress address = mock(SocketAddress.class);
        List<Position> actualPositionList = decoder.decodeCompressedPositions(channel, address, buf);
        assertEquals(1, actualPositionList.size());
    }

    @Test
    public void decodeIridiumPositionTest() {
        Protocol protocol = new Protocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        ByteBuf buf = Unpooled.buffer();
        buf.writeShortLE(10);
        buf.writeMediumLE(0x01001c);

        buf.writeIntLE(1234); // index
        buf.writeCharSequence(DEVICE_IDENTIFICATION, StandardCharsets.US_ASCII);

        buf.writeByte(1); // session status
        buf.writeInt(0); // reserved
        buf.writeIntLE(1546300800); // date and time

        buf.writeBytes(new byte[23]); // coordinates block

        buf.writeMediumLE(2); // data tag header
        buf.writeMediumLE(3); // minimal data set

        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        Position position = decoder.decodeIridiumPosition(channel, remoteAddress, buf);

        assertEquals(DEVICE_IDENTIFICATION, position.getDeviceId());
    }

}