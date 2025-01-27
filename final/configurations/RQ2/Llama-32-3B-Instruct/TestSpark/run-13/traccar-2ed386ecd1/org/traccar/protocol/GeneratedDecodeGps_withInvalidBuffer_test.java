package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.model.Position;

public class GeneratedDecodeGps_withInvalidBuffer_test {

    @Test
    public void decodeGps_withInvalidBuffer_test() {
        assertNotEquals(true, Gt06ProtocolDecoder.decodeGps(new Position(), null, true, null));
    }
}

}