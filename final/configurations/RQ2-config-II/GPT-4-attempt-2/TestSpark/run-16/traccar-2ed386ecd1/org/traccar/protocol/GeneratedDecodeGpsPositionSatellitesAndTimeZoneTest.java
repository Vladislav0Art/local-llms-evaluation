package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import io.netty.buffer.Unpooled;
import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;

import java.util.TimeZone;

public class GeneratedDecodeGpsPositionSatellitesAndTimeZoneTest {

    @Test
    public void decodeGpsPositionSatellitesAndTimeZoneTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(), false, true, false, TimeZone.getDefault());
        Assert.assertEquals(false, result);
    }

}