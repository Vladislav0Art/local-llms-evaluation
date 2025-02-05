package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;
import org.traccar.Protocol;

import java.nio.charset.StandardCharsets;
import java.time.ZoneId;
import java.util.TimeZone;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;

public class GeneratedDecodeGpsPositionWithoutLengthSatellitesSpeedTest {

    private Gt06ProtocolDecoder getDecoder() {
        Protocol protocol = new Protocol("TestProtocol");
        return new Gt06ProtocolDecoder(protocol);
    }

    @Test
    public void decodeGpsPositionWithoutLengthSatellitesSpeedTest() {
        Gt06ProtocolDecoder decoder = getDecoder();
        Position pos = new Position();
        ByteBuf buf = Unpooled.wrappedBuffer("Position".getBytes(StandardCharsets.UTF_8));
        assertFalse(decoder.decodeGps(pos, buf, false, false, false, TimeZone.getTimeZone(ZoneId.of("GMT"))));
    }

}