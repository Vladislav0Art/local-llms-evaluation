package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;

import static org.mockito.Mockito.*;

public class GeneratedGetManufacturerCustomTest {

    @Test
    public void getManufacturerCustomTest() {
        Protocol protocol = mock(Protocol.class);
        when(protocol.getManufacturer()).thenReturn("Custom");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertEquals("Custom", decoder.getManufacturer());
    }

}