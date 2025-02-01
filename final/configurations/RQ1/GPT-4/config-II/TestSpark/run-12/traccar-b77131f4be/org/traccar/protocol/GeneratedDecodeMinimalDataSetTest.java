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

public class GeneratedDecodeMinimalDataSetTest {

    private GalileoProtocolDecoder decoder;

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

}