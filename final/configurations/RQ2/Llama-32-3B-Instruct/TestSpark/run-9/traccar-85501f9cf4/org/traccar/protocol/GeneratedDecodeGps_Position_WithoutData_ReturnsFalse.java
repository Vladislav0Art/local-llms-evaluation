package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.Gt06ProtocolDecoder;
import org.mockito.Mockito;

public class GeneratedDecodeGps_Position_WithoutData_ReturnsFalse {

    @Test
    public void decodeGps_Position_WithoutData_ReturnsFalse() {
        Object result = Mockito.mock(Object.class);
        boolean resultBoolean = (boolean) result;
        assertEquals(false, resultBoolean);
    }

}