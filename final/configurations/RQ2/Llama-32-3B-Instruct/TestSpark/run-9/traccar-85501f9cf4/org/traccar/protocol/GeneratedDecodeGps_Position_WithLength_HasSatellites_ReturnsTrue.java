package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.Gt06ProtocolDecoder;
import org.mockito.Mockito;

public class GeneratedDecodeGps_Position_WithLength_HasSatellites_ReturnsTrue {

    @Test
    public void decodeGps_Position_WithLength_HasSatellites_ReturnsTrue() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Gt06ProtocolDecoder.class);
        Object result = Mockito.mock(Object.class);
        boolean resultBoolean = (boolean) result;
        assertTrue(decoder.decodeGps(new Position(), Mockito.mock(ByteBuf.class), true, true, false, null));
    }

}