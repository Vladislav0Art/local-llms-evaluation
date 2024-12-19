package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestDecodeGpsSatellites {

    @Test
    public void testDecodeGpsSatellites() {
        Position position = new Position(37.7749, -122.4194);
        ByteBuf buf = mock(ByteBuf.class);
        when(buf.readInt()).thenReturn((byte) 6);
        when(buf.readInt8()).thenReturn((byte) 7);
        Object decodedMessage = Gt06ProtocolDecoder.decodeGps(position, buf, true, false, false, null);
        assertEquals(37.7749, ((Position) decodedMessage).getX(), 0.001);
        assertEquals(-122.4194, ((Position) decodedMessage).getY(), 0.001);
    }

}