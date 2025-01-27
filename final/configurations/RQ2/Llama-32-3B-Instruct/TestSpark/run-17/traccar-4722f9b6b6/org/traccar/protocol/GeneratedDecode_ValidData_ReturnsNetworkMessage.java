package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecode_ValidData_ReturnsNetworkMessage {

    @Mock
    private Protocol protocol;

    @Mock
    private DeviceSession session;

    private WatchProtocolDecoder decoder;

    public void setup() {
        decoder = new WatchProtocolDecoder(protocol);
    }

    @Test
    public void decode_ValidData_ReturnsNetworkMessage() {
        setup();
        byte[] buffer = "valid data".getBytes(StandardCharsets.UTF_8);
        when(protocol.getDecoder()).thenReturn(new Parser(BufferUtil.buildBuffer()));
        Network network = mock(Network.class);
        Position position = mock(Position.class);
        CellTower cellTower = mock(CellTower.class);
        WifiAccessPoint wifiAccessPoint = mock(WifiAccessPoint.class);
        NetworkMessage message = decoder.decode(null, null, null);
        verify(network).createFromBuffer(buffer);
        assertEquals(position, message.getPosition());
        assertTrue(cellTower != null && verify(cellTower).createFromBuffer(buffer));
        assertTrue(wifiAccessPoint != null && verify(wifiAccessPoint).createFromBuffer(buffer));
    }

}