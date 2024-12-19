package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GeneratedTestDecodeGpsPositionSatellites {

    @Test
    public void testDecodeGpsPositionSatellites() {
        Position position = new Position();
        ByteBuf buf = Mockito.mock(ByteBuf.class);
        boolean hasLength = true;
        boolean hasSatellites = false;
        TimeZone timezone = TimeZone.NO_TIME_ZONE;
        when(mockProtocol.decode(position, buf, hasLength, timezone)).thenReturn(true);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        verify(decoder, times(1)).decode(Position.class, buf, hasLength, hasSatellites, timezone);
    }

}