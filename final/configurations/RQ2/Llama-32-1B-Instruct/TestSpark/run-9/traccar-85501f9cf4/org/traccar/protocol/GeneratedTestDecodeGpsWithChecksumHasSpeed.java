package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.traccar.protocol.Gt06ProtocolDecoder;

public class GeneratedTestDecodeGpsWithChecksumHasSpeed {

    @Test
    public void testDecodeGpsWithChecksumHasSpeed() {
        byte[] input = new byte[]{1};
        Position position = Mockito.mock(Position.class);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        Object result = decoder.decode(input, null, false, true, true, new Checksum());

        assertEquals(true, (boolean) ((Checksum) result).getChecksum(), 0.001);
    }

}