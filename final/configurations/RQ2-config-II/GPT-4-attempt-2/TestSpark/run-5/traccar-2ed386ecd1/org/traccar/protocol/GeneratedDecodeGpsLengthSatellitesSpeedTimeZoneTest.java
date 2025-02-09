package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedDecodeGpsLengthSatellitesSpeedTimeZoneTest {

    @Test
    public void decodeGpsLengthSatellitesSpeedTimeZoneTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("01020304", StandardCharsets.UTF_8);
        TimeZone timeZone = TimeZone.getDefault();
        Assert.assertTrue(decoder.decodeGps(position, buf, true, false, true, timeZone));
    }

}