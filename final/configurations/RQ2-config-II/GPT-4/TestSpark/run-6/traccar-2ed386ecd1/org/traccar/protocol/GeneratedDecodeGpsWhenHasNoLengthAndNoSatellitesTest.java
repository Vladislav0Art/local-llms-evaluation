package org.traccar.protocol;

import org.junit.Test;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.model.Position;
import org.traccar.Protocol;

import static org.junit.Assert.*;

import java.util.TimeZone;

public class GeneratedDecodeGpsWhenHasNoLengthAndNoSatellitesTest {

    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));

    @Test
    public void decodeGpsWhenHasNoLengthAndNoSatellitesTest() {
        ByteBuf buf = Unpooled.buffer();
        Position position = new Position();
        assertFalse(decoder.decodeGps(position, buf, false, false, false, TimeZone.getDefault()));
    }

}