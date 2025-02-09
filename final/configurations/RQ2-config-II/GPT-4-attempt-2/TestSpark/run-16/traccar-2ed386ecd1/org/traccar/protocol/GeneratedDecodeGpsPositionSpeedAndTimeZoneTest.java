package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import io.netty.buffer.Unpooled;
import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;

import java.util.TimeZone;

public class GeneratedDecodeGpsPositionSpeedAndTimeZoneTest {

    @Test
    public void decodeGpsPositionSpeedAndTimeZoneTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(), false, false, true, TimeZone.getDefault());
        Assert.assertEquals(false, result);
    }

}