package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.traccar.protocol.Gt06ProtocolDecoder;

public class GeneratedTestDecodePosition_Geolocation {

    @Test
    public void testDecodePosition_Geolocation() {
        byte[] input = new byte[]{1, 2, 3, 4};
        Position position = Mockito.mock(Position.class);
        when(position.getLatitude()).thenReturn(5);
        when(position.getLongitude()).thenReturn(6);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        Object result = decoder.decode(input, null, false, false, false, null);

        assertEquals(1, ((Position) result).getLatitude(), 0.001);
        assertEquals(2, ((Position) result).getLongitude(), 0.001);
    }

}