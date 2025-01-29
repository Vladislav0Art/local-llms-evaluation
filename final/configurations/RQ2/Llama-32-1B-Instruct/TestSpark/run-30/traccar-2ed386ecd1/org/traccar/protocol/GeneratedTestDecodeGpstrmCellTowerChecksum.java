package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedTestDecodeGpstrmCellTowerChecksum {

    @Mock
    private Protocol protocol;

    @Mock
    private CellTower cellTower;

    @Test
    public void testDecodeGpstrmCellTowerChecksum() {
        // Given
        ByteBuf buf = Mockito.mock(ByteBuf.class);

        // When
        Object result = Gt06ProtocolDecoder.decodeGps(cellTower, buf, true, true, false, java.time.ZoneId.systemDefault());

        // Then
        assertTrue(result instanceof CellTower);
    }

}