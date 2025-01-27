package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.HashMap;

public class GeneratedDecodeGps_NoPosition_ThrowsException {

    @Test
    public void decodeGps_NoPosition_ThrowsException() {
        assertTrue(Gt06ProtocolDecoder.decodeGps(null, null, false, null));
    }

}