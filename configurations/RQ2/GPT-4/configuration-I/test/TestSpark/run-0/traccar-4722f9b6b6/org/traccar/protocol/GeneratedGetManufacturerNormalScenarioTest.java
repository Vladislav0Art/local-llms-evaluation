package org.traccar.protocol;

import org.junit.Test;
import org.traccar.protocol.WatchProtocolDecoder;

import static org.mockito.Mockito.*;

import org.traccar.Protocol;

import static org.junit.Assert.*;

import java.net.SocketAddress;

public class GeneratedGetManufacturerNormalScenarioTest {

    @Test
    public void getManufacturerNormalScenarioTest() {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        String result = decoder.getManufacturer();

        assertNotNull(result);
    }

}