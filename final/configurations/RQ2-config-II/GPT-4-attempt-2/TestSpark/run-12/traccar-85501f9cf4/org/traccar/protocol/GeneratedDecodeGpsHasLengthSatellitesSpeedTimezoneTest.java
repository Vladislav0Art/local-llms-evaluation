package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGpsHasLengthSatellitesSpeedTimezoneTest {

    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));

    @Test
    public void decodeGpsHasLengthSatellitesSpeedTimezoneTest() {
        ByteBuf buf = Unpooled.copiedBuffer("24 24 0003 359231030010232 103007 2210090524 13564960446029140000 00284A2A0D0A".getBytes(StandardCharsets.US_ASCII));
        Position position = new Position();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getTimeZone("GMT")));
    }

}