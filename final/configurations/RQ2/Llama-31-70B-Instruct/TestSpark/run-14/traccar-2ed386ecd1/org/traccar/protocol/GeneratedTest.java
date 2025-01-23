package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    private Gt06ProtocolDecoder gt06ProtocolDecoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));

    @Test
    public void testDecodeGps() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        boolean hasLength = true;
        TimeZone timezone = TimeZone.getDefault();

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, timezone);

        assertTrue(result);
    }

    @Test
    public void testDecodeGpsWithSatellites() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer();
        boolean hasLength = true;
        boolean hasSatellites = true;
        boolean hasSpeed = true;
        TimeZone timezone = TimeZone.getDefault();

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, hasSatellites, hasSpeed, timezone);

        assertTrue(result);
    }

    @Test
    public void testDecode() throws Exception {
        Object msg = new Object();

        Object result = gt06ProtocolDecoder.decode(null, null, msg);

        assertEquals(null, result);
    }

}