package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestDecodeGpsHasSpeed {

    @Test
    public void testDecodeGpsHasSpeed() {
        Position position = new Position(37.7749, -122.4194);
        ByteBuf buf = mock(ByteBuf.class);
        when(buf.readInt()).thenReturn((byte) 16);
        when(buf.readInt8()).thenReturn((byte) 17);
        Object decodedMessage = Gt06ProtocolDecoder.decodeGps(position, buf, true, false, true, null);
        assertEquals(37.7749, ((Position) decodedMessage).getX(), 0.001);
        assertEquals(-122.4194, ((Position) decodedMessage).getY(), 0.001);
    }

}