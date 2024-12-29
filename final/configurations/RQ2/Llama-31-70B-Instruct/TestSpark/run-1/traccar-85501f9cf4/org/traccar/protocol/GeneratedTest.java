package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    @Test
    public void testDecodeGps() {
        Gt06ProtocolDecoder gt06ProtocolDecoder = new Gt06ProtocolDecoder(null);
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        boolean hasLength = true;
        TimeZone timezone = TimeZone.getDefault();
        assertTrue(gt06ProtocolDecoder.decodeGps(position, buf, hasLength, timezone));
    }

}