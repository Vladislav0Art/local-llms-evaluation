package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.BaseProtocolDecoder;
import org.traccar.DeviceSession;
import org.traccar.NetworkMessage;
import org.traccar.Protocol;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;
import org.traccar.protocol.WatchProtocolDecoder;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private WatchProtocolDecoder decoder;

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private Protocol protocol;

    @Test
    public void testDecode_INIT() {
        SocketAddress remoteAddress = SocketAddress.valueOf("localhost");
        NetworkMessage message = new NetworkMessage(Unpooled.copiedBuffer("[ABC*123*4*INIT".getBytes(StandardCharsets.US_ASCII)), remoteAddress);
        Object result = decoder.decode(null, remoteAddress, message);
        assertEquals("INIT,1", result);
    }

    @Test
    public void testDecode_LK() {
        SocketAddress remoteAddress = SocketAddress.valueOf("localhost");
        NetworkMessage message = new NetworkMessage(Unpooled.copiedBuffer("[ABC*123*4*LK,1,2,3".getBytes(StandardCharsets.US_ASCII)), remoteAddress);
        Object result = decoder.decode(null, remoteAddress, message);
        Position position = (Position) result;
        assertEquals("ABC", position.getDeviceId());
        assertEquals(1, position.get(Position.KEY_BATTERY_LEVEL));
        assertEquals(2, position.get(Position.KEY_STEPS));
    }

}