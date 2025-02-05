package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.util.TimeZone;

import static org.junit.Assert.*;

public class GeneratedDecodeGpsWithoutLengthAndTimeZoneTest {

    @Test
    public void decodeGpsWithoutLengthAndTimeZoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.wrappedBuffer("testdata".getBytes());
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, null));
    }

}