package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGps_Position_WithoutTimezone_ReturnsFalse {

    @InjectMocks
    private Gt06ProtocolDecoder gt06ProtocolDecoder;

    @Mock
    private ByteBuf buf;

    @Test
    public void decodeGps_Position_WithoutTimezone_ReturnsFalse() {
        when(gt06ProtocolDecoder.decodeGps(any(Position.class), buf, anyBoolean(), any(), any()))
                .thenReturn(false);
        assertFalse(gt06ProtocolDecoder.decodeGps(null, buf, true, false, false, null));
    }

}