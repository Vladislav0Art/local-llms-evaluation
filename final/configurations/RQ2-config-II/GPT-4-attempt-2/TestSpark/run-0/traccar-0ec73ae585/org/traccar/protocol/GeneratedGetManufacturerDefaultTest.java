package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;

import static org.mockito.Mockito.*;

public class GeneratedGetManufacturerDefaultTest {

    @Test
    public void getManufacturerDefaultTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertEquals("Unknown", decoder.getManufacturer());
    }

}