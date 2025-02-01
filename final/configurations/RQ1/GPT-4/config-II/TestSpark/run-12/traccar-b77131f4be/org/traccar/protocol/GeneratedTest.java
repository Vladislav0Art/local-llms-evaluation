package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.model.Position;
import org.traccar.session.DeviceSession;
import org.traccar.Protocol;

import java.net.SocketAddress;
import java.util.List;

import io.netty.channel.Channel;
import io.netty.buffer.Unpooled;
import io.netty.buffer.ByteBuf;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class GeneratedTest {

    private GalileoProtocolDecoder decoder;

    @Test
    public void decodeIridiumPositionTest() {
        ByteBuf buf = Unpooled.buffer();
        buf.writeBytes(new byte[]{0x01, 0x00, 0x00, (byte) 0x01, (byte) 0x01, (byte) 0xc0});

        SocketAddress remoteAddress = null;
        Channel channel = null;

        decoder = new GalileoProtocolDecoder(new Protocol("galileo"));
        Position result = decoder.decodeIridiumPosition(channel, remoteAddress, buf);

        assertNull(result);
    }

    @Test
    public void decodeTagOtherTest() {
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte((byte) 0x01);
        buf.writeByte((byte) 0x55);

        Position position = new Position();
        decoder = new GalileoProtocolDecoder(new Protocol("galileo"));
        decoder.decodeTagOther(position, buf, buf.getByte(0));

        assertEquals(position.getAttributes().get(Position.KEY_VERSION_HW), 85);
    }

    @Test
    public void decodeMinimalDataSetTest() {
        ByteBuf buf = Unpooled.buffer();
        buf.writeBytes(new byte[]{(byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000,
                (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000000, (byte) 0b00000001,
                (byte) 0b10000000, (byte) 0b00000000});

        Position position = new Position();
        decoder = new GalileoProtocolDecoder(new Protocol("galileo"));

        decoder.decodeMinimalDataSet(position, buf);

        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.set(Calendar.DAY_OF_YEAR, 1);
        calendar.set(Calendar.HOUR_OF_DAY, calendar.getActualMinimum(Calendar.HOUR_OF_DAY));
        calendar.set(Calendar.MINUTE, calendar.getActualMinimum(Calendar.MINUTE));
        calendar.set(Calendar.SECOND, calendar.getActualMinimum(Calendar.SECOND));
        calendar.set(Calendar.MILLISECOND, calendar.getActualMinimum(Calendar.MILLISECOND));
        calendar.add(Calendar.SECOND, 1);

        assertEquals(calendar.getTime(), position.getFixTime());
    }

    @Test
    public void getTagLengthTest() {
        decoder = new GalileoProtocolDecoder(new Protocol("galileo"));

        int expectedTagLength = 1;
        int resultTagLength = decoder.getTagLength(0b00000001);

        assertEquals(expectedTagLength, resultTagLength);
    }

}