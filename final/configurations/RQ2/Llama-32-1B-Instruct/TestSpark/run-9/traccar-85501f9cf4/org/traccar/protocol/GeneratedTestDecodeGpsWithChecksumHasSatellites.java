package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.traccar.protocol.Gt06ProtocolDecoder;

public class GeneratedTestDecodeGpsWithChecksumHasSatellites {

    @Test
    public void testDecodeGpsWithChecksumHasSatellites() {
        byte[] input = new byte[]{1, 2, 3};
        Position position = Mockito.mock(Position.class);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        Object result = decoder.decode(input, null, true, false, true, new Checksum());

        assertEquals(true, (boolean) ((Checksum) result).getChecksum(), 0.001);
    }

}