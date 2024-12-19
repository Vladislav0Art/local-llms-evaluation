package org.traccar.protocol;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedGetManufacturerTest {

    @Test
    public void getManufacturerTest() {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object msg = Mockito.mock(Object.class);

        Protocol protocol = new Protocol();

        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertEquals("Unknown", decoder.getManufacturer(channel, remoteAddress, msg));
    }

}