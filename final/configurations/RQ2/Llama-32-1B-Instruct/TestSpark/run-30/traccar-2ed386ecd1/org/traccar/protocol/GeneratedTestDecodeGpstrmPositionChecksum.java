package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestDecodeGpstrmPositionChecksum {

    @Mock
    private Protocol protocol;

    @Mock
    private CellTower cellTower;

    @Test
    public void testDecodeGpstrmPositionChecksum() {
        // Given
        ByteBuf buf = Mockito.mock(ByteBuf.class);

        // When
        Object result = Gt06ProtocolDecoder.decodeGps(new Position(37.7749, -122.4194), buf, true, false, false, java.time.ZoneId.systemDefault());

        // Then
        assertTrue(result instanceof Network);
    }

}