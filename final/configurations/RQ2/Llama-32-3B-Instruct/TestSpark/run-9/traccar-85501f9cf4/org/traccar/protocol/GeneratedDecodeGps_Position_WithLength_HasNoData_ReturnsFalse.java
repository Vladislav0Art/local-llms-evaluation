package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.Gt06ProtocolDecoder;
import org.mockito.Mockito;

public class GeneratedDecodeGps_Position_WithLength_HasNoData_ReturnsFalse {

    @Test
    public void decodeGps_Position_WithLength_HasNoData_ReturnsFalse() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Gt06ProtocolDecoder.class);
        Object result = Mockito.mock(Object.class);
        boolean resultBoolean = (boolean) result;
        assertFalse(decoder.decodeGps(new Position(), Mockito.mock(ByteBuf.class), true, false, false, null));
    }

}