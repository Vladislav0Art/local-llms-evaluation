package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedDecodeGps_ReturnsFalse_WhenHasLengthButNotGps {

    @Test
    public void decodeGps_ReturnsFalse_WhenHasLengthButNotGps() {
        Position position = new Position(0, 0);
        ByteBuf buf = ByteBuffer.allocate(2);
        boolean hasLength = true;
        TimeZone timezone = new TimeZone();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, false, false, timezone));
    }

}