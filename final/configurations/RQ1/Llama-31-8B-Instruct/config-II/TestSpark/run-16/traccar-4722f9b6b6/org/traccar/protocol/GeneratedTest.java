package org.traccar.protocol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.model.CellTower;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.protocol.WatchProtocolDecoderTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private DeviceSession deviceSession;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @InjectMocks
    private WatchProtocolDecoder decoder;

    @Test
    public void testDecode_INIT() {
        // Given
        String id = "id";
        String index = "index";
        String content = "INIT,1";

        // When
        Object result = decoder.decode(channel, remoteAddress, content);

        // Then
        assertNotNull(result);
        assertTrue(result instanceof NetworkMessage);
    }

    @Test
    public void testDecode_LK() {
        // Given
        String id = "id";
        String index = "index";
        String content = "LK,0,0,0";

        // When
        Object result = decoder.decode(channel, remoteAddress, content);

        // Then
        assertNotNull(result);
        assertTrue(result instanceof Position);
    }

}