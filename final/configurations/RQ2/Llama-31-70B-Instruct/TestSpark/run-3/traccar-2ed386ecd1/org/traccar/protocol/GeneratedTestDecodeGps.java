package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertTrue;

public class GeneratedTestDecodeGps {

    @Test
    public void testDecodeGps() {
        Gt06ProtocolDecoder gt06ProtocolDecoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        boolean hasLength = true;
        TimeZone timezone = TimeZone.getDefault();
        assertTrue(gt06ProtocolDecoder.decodeGps(position, buf, hasLength, timezone));
    }

}