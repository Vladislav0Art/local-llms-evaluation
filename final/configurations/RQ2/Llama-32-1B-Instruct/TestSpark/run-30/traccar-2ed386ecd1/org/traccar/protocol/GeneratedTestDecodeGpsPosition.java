package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestDecodeGpsPosition {

    @Mock
    private Protocol protocol;

    @Mock
    private CellTower cellTower;

    @Test
    public void testDecodeGpsPosition() {
        // Given
        Position position = new Position(37.7749, -122.4194);
        ByteBuf buf = Mockito.mock(ByteBuf.class);

        // When
        Object result = Gt06ProtocolDecoder.decodeGps(position, buf, false, false, false, java.time.ZoneId.systemDefault());

        // Then
        assertTrue(result instanceof Position);
    }

}