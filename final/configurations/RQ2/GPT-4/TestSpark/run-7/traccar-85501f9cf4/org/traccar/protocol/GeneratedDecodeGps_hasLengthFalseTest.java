package org.traccar.protocol;

import org.junit.Test;
import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.model.Position;
import io.netty.buffer.Unpooled;

import java.util.TimeZone;

import static org.junit.Assert.*;

public class GeneratedDecodeGps_hasLengthFalseTest {

    @Test
    public void decodeGps_hasLengthFalseTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(null);
        Position position = new Position();
        byte[] bytes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.wrappedBuffer(bytes), false, TimeZone.getDefault());

        assertFalse(result);
    }

}