package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.traccar.protocol.Gt06ProtocolDecoder;

public class GeneratedTestDecodeGpsNoLatLongHasSpeed {

    @Test
    public void testDecodeGpsNoLatLongHasSpeed() {
        byte[] input = new byte[]{1};
        Position position = Mockito.mock(Position.class);
        when(position.getLatitude()).thenReturn(5);
        when(position.getLongitude()).thenReturn(6);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        Object result = decoder.decode(input, null, false, true, true, null);

        assertNull(result);
    }

}