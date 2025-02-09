package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;

import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodeGpsWithLengthSatellitesSpeedTimeTest {

    @Test
    public void decodeGpsWithLengthSatellitesSpeedTimeTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        buf.writeByte((byte) 0); // status
        buf.writeByte((byte) 1); // satellites
        buf.writeByte((byte) 0); // longitude
        buf.writeByte((byte) 0); // latitude
        buf.writeByte((byte) 0); // speed
        buf.writeLong(0L); // time
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getDefault());
        assertFalse(result);
    }

}