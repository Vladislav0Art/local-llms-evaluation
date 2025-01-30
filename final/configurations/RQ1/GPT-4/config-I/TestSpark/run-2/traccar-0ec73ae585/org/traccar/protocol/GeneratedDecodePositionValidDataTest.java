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

public class GeneratedDecodePositionValidDataTest {

    private Protocol createProtocolMock() {
        Protocol protocol = Mockito.mock(Protocol.class);
        when(protocol.getString(anyString(), anyString())).thenReturn("test");
        return protocol;
    }

    @Test
    public void decodePositionValidDataTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(createProtocolMock());
        DeviceSession deviceSession = Mockito.mock(DeviceSession.class);
        when(deviceSession.getDeviceId()).thenReturn(2L);
        Position position = decoder.decodePosition(deviceSession, "191201,193754,A,-33.4256742,S,18.7311297,E,0.57,97.03,0.0,0,30,53,39,866,5,00,65501,65501,33668,58609,18,33665,58965,18,33665,59163,18,33667,38243,19,250,32,80665,100");
        assertNotNull(position);
    }

}