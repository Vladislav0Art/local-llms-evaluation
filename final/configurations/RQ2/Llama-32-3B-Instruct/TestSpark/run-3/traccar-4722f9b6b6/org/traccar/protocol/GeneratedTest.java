package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private NetworkMessage networkMessage;

    @Mock
    private Channel channel;

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

    @Test
    public void getHasIndex_EmptyArray_ReturnsFalse() {
        boolean result = decoder.getHasIndex();
        assertTrue(result);
    }

    @Test
    public void getHasIndex_NonEmptyArray_ReturnsTrue() {
        Mockito.when(deviceSession.getWatchProtocol()).thenReturn("non-empty array");
        boolean result = decoder.getHasIndex();
        assertTrue(result);
    }

    @Test
    public void getManufacturer_HasManufacturer_ExpectedResult() {
        String manufacturer = "Manufacturer";
        Mockito.when(deviceSession.getManufacturer()).thenReturn(manufacturer);
        assertEquals(manufacturer, decoder.getManufacturer());
    }

    @Test
    public void getManufacturer_NoManufacturer_ReturnsNull() {
        Mockito.when(deviceSession.getManufacturer()).thenReturn(null);
        assertEquals(null, decoder.getManufacturer());
    }

    @Test
    public void decode_UnknownMessage_ReturnsError() throws Exception {
        Object msg = new Object();
        Object result = decoder.decode(channel, "localhost", msg);
        assertTrue(result instanceof Exception);
    }

    @Test
    public void decode_ProtocolMatch_DecodedResultIsNetworkMessage() throws Exception {
        NetworkMessage expectedMsg = createMockNetworkMessage(1, 2, 3);
        Mockito.when(deviceSession.getWatchProtocol()).thenReturn("protocol match");
        Object result = decoder.decode(channel, "localhost", networkMessage);
        assertEquals(expectedMsg, result);
    }

    @Test
    public void decode_ProtocolMismatch_ReturnsError() throws Exception {
        NetworkMessage expectedMsg = createMockNetworkMessage(1, 2, 3);
        Mockito.when(deviceSession.getWatchProtocol()).thenReturn("protocol mismatch");
        Object result = decoder.decode(channel, "localhost", networkMessage);
        assertTrue(result instanceof Exception);
    }

    private NetworkMessage createMockNetworkMessage(int id, int latitude, int longitude) {
        Position position = new Position(id, latitude, longitude);
        return new NetworkMessage(position, new CellTower(), new WifiAccessPoint());
    }

}