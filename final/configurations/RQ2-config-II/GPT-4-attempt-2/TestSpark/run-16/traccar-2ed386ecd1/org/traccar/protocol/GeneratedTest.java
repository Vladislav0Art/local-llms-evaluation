package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import io.netty.buffer.Unpooled;
import org.traccar.model.Position;
import org.traccar.protocol.Gt06ProtocolDecoder;

import java.util.TimeZone;

public class GeneratedTest {

    @Test
    public void decodeGpsPositionTimeZoneTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(), true, TimeZone.getDefault());
        Assert.assertEquals(false, result);
    }

    @Test
    public void decodeGpsPositionLengthAndTimeZoneTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(), false, false, false, TimeZone.getDefault());
        Assert.assertEquals(false, result);
    }

    @Test
    public void decodeExceptionTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        decoder.decode(null, null, new Object());
    }

    @Test
    public void decodeGpsPositionNoLengthNoTimeZoneTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(), false, TimeZone.getDefault());
        Assert.assertEquals(false, result);
    }

    @Test
    public void decodeGpsPositionSatellitesAndTimeZoneTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(), false, true, false, TimeZone.getDefault());
        Assert.assertEquals(false, result);
    }

    @Test
    public void decodeGpsPositionSpeedAndTimeZoneTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(), false, false, true, TimeZone.getDefault());
        Assert.assertEquals(false, result);
    }

}