package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.model.Position;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeMinimalDataSetTest {

    @Test
    public void decodeMinimalDataSetTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(new GalileoProtocol());
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        buf.capacity(10);

        // Setting longitude and latitude to maximum values.
        int seconds = (int) Instant.now().getEpochSecond();
        int latitude = (int) Math.round((90 + (180 * Math.random())) * 2097152d / 180d);
        int longitude = (int) Math.round((180 * Math.random()) * 4194304d / 360d);

        // Encoding longitude, latitude, and time into the buffer.
        buf.writeByte((seconds << 7) | 1);
        buf.writeInt(((seconds >>> 1) << 22) | longitude);
        buf.writeInt((latitude << 11) | (seconds >>> 17));

        decoder.decodeMinimalDataSet(position, buf);

        Date currentDate = Date.from(Instant.now());
        assertEquals(currentDate.getYear(), position.getDeviceTime().getYear());
        assertEquals(currentDate.getMonth(), position.getDeviceTime().getMonth());
        assertEquals(currentDate.getDate(), position.getDeviceTime().getDate());
        assertTrue(position.getLongitude() < 180 && position.getLongitude() > -180);
        assertTrue(position.getLatitude() < 90 && position.getLatitude() > -90);
    }

}