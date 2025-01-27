package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_NoNetowrkMessage {

    @Mock
    private DeviceSession deviceSession;

    @Test
    public void decode_NoNetowrkMessage() throws Exception {
        when(deviceSession.getCellTower()).thenReturn(new CellTower(1, "name", 123.45));
        when(deviceSession.getNetworkMessage()).thenReturn(null);
        when(deviceSession.getProtocol()).thenReturn(WatchProtocolDecoder.class);

        byte[] bytes = WatchProtocolDecoder.decode(null, null, null);
        assertNotNull(bytes);
    }

}