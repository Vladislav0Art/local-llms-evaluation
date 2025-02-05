package org.traccar.protocol;

import org.junit.Test;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.model.Position;
import org.traccar.Protocol;

import static org.junit.Assert.*;

import java.util.TimeZone;

public class GeneratedDecodeGpsWhenHasLengthTest {

    private Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));

    @Test
    public void decodeGpsWhenHasLengthTest() {
        ByteBuf buf = Unpooled.buffer();
        Position position = new Position();
        assertTrue(decoder.decodeGps(position, buf, true, TimeZone.getDefault()));
    }

}