package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class GeneratedTestDecodeGpsPositionNoLength {

    @Test
    public void testDecodeGpsPositionNoLength() {
        Position position = new Position();
        ByteBuf buf = Mockito.mock(ByteBuf.class);
        boolean hasLength = false;
        TimeZone timezone = TimeZone.NO_TIME_ZONE;
        when(mockProtocol.decode(position, buf, hasLength, timezone)).thenReturn(false);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        verify(decoder, times(1)).decode(Position.class, buf, hasLength, timezone);
    }

}