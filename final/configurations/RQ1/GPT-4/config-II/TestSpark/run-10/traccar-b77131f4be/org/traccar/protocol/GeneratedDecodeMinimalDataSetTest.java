package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeMinimalDataSetTest {

    @Test
    public void decodeMinimalDataSetTest() {
        Position position = new Position("galileo");

        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.set(Calendar.DAY_OF_YEAR, 1);
        calendar.set(Calendar.HOUR_OF_DAY, calendar.getActualMinimum(Calendar.HOUR_OF_DAY));
        calendar.set(Calendar.MINUTE, calendar.getActualMinimum(Calendar.MINUTE));
        calendar.set(Calendar.SECOND, calendar.getActualMinimum(Calendar.SECOND));
        calendar.set(Calendar.MILLISECOND, calendar.getActualMinimum(Calendar.MILLISECOND));
        calendar.add(Calendar.SECOND, 2);

        ByteBuf buf = Unpooled.buffer(10);
        buf.writeLong(calendar.getTimeInMillis() / 1000);
        buf.writeByte(0x01); // alarm bit

        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new GalileoProtocol());
        decoder.decodeMinimalDataSet(position, buf);

        assertEquals(calendar.getTime(), position.getDeviceTime());
        assertEquals(Position.ALARM_GENERAL, position.getAlarm());
    }

}