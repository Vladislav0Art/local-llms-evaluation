package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_CellTower {

    @Mock
    private DeviceSession deviceSession;

    @Test
    public void decode_CellTower() throws Exception {
        when(deviceSession.getCellTower()).thenReturn(new CellTower(1, "name", 123.45));
        when(deviceSession.getNetworkMessage()).thenReturn(new NetworkMessage("key", "value"));
        when(deviceSession.getProtocol()).thenReturn(WatchProtocolDecoder.class);

        byte[] bytes = WatchProtocolDecoder.decode(null, null, null);
        assertNotNull(bytes);
    }

}