package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

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

    @Test
    public void decode_NoCellTower() throws Exception {
        when(deviceSession.getCellTower()).thenReturn(null);
        when(deviceSession.getNetworkMessage()).thenReturn(new NetworkMessage("key", "value"));
        when(deviceSession.getProtocol()).thenReturn(WatchProtocolDecoder.class);

        byte[] bytes = WatchProtocolDecoder.decode(null, null, null);
        assertNotNull(bytes);
    }

    @Test
    public void decode_NoNetowrkMessage() throws Exception {
        when(deviceSession.getCellTower()).thenReturn(new CellTower(1, "name", 123.45));
        when(deviceSession.getNetworkMessage()).thenReturn(null);
        when(deviceSession.getProtocol()).thenReturn(WatchProtocolDecoder.class);

        byte[] bytes = WatchProtocolDecoder.decode(null, null, null);
        assertNotNull(bytes);
    }

    @Test
    public void decode_NoDeviceSession() throws Exception {
        when(deviceSession.getCellTower()).thenReturn(new CellTower(1, "name", 123.45));
        when(deviceSession.getNetworkMessage()).thenReturn(new NetworkMessage("key", "value"));
        when(deviceSession.getProtocol()).thenReturn(WatchProtocolDecoder.class);

        byte[] bytes = WatchProtocolDecoder.decode(null, null, null);
        assertNotNull(bytes);
    }

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

    @Test
    public void getHasIndex_ReturnsFalse() {
        assertTrue(!WatchProtocolDecoder.getHasIndex());
    }

    @Test
    public void getManufacturer_ReturnsManufacturer() {
        assertEquals("manufacturer", WatchProtocolDecoder.getManufacturer(deviceSession));
    }

}