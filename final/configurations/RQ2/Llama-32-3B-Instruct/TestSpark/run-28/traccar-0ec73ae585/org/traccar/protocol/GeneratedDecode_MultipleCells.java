package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_MultipleCells {

    @Mock
    private DeviceSession deviceSession;

    @Test
    public void decode_MultipleCells() throws Exception {
        CellTower cellTower1 = new CellTower(1, "name", 123.45);
        CellTower cellTower2 = new CellTower(2, "name", 456.78);
        when(deviceSession.getCellTower()).thenReturn(new CellTower[]{cellTower1, cellTower2});
        when(deviceSession.getNetworkMessage()).thenReturn(new NetworkMessage("key", "value"));
        when(deviceSession.getProtocol()).thenReturn(WatchProtocolDecoder.class);

        byte[] bytes = WatchProtocolDecoder.decode(null, null, null);
        assertNotNull(bytes);
    }

}