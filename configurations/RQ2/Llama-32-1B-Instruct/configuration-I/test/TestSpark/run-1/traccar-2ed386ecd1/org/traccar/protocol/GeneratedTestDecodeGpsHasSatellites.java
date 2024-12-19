package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestDecodeGpsHasSatellites {

    public ByteBuf mockBuf = mock(ByteBuf.class);
    public Position position = new Position(37.7749, -122.4194);

    @Test
    public void testDecodeGpsHasSatellites() {
        when(mockBuf.readInt()).thenReturn((byte) 14);
        when(mockBuf.readInt8()).thenReturn((byte) 15);
        Object decodedMessage = Gt06ProtocolDecoder.decodeGps(position, mockBuf, true, false, null, null);
        assertEquals(37.7749, ((Position) decodedMessage).getX());
        assertEquals(-122.4194, ((Position) decodedMessage).getY(), 0.001);
    }

}