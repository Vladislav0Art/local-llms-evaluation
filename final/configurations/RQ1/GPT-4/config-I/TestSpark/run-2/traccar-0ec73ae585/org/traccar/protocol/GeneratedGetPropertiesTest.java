package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.CellTower;
import org.traccar.model.WifiAccessPoint;
import org.traccar.model.Network;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;
import org.traccar.protocol.WatchProtocolDecoder;
import org.mockito.Mockito;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetPropertiesTest {

    private Protocol createProtocolMock() {
        Protocol protocol = Mockito.mock(Protocol.class);
        when(protocol.getString(anyString(), anyString())).thenReturn("test");
        return protocol;
    }

    @Test
    public void getPropertiesTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(createProtocolMock());
        assertEquals("test", decoder.getProtocolName());
        assertFalse(decoder.getHasIndex());
        assertNull(decoder.getManufacturer());
    }

}