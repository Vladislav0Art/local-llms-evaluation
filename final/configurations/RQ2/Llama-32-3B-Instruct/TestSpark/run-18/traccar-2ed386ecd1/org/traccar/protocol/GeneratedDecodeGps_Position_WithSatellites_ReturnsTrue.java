package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeGps_Position_WithSatellites_ReturnsTrue {

    @InjectMocks
    private Gt06ProtocolDecoder gt06ProtocolDecoder;

    @Mock
    private ByteBuf buf;

    @Test
    public void decodeGps_Position_WithSatellites_ReturnsTrue() {
        when(gt06ProtocolDecoder.decodeGps(any(Position.class), buf, anyBoolean(), true))
                .thenReturn(true);
        assertTrue(gt06ProtocolDecoder.decodeGps(null, buf, true, true, false, null));
    }

}