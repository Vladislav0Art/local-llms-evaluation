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
public class GeneratedDecode_ProtocolMismatch_ReturnsError {

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private NetworkMessage networkMessage;

    @Mock
    private Channel channel;

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);

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