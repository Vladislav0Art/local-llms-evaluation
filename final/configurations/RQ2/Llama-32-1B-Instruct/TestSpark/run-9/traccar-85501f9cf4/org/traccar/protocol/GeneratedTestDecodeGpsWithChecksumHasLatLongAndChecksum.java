package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.traccar.protocol.Gt06ProtocolDecoder;

public class GeneratedTestDecodeGpsWithChecksumHasLatLongAndChecksum {

    @Test
    public void testDecodeGpsWithChecksumHasLatLongAndChecksum() {
        byte[] input = new byte[]{1, 2, 3};
        Position position = Mockito.mock(Position.class);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        Object result = decoder.decode(input, null, false, true, true, new Checksum());

        assertEquals(5, ((Position) result).getLatitude(), 0.001);
        assertEquals(6, ((Position) result).getLongitude(), 0.001);
    }

}