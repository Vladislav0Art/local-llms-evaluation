package org.traccar.protocol;

import io.netty.channel.Channel;

import java.util.Date;
import java.net.SocketAddress;

import org.traccar.Protocol;
import org.mockito.Mockito;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedGetManufacturerDefaultTest {

    @Test
    public void getManufacturerDefaultTest() {
        Protocol testProtocol = new Protocol("testProtocol");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(testProtocol);

        assertEquals("unknown", decoder.getManufacturer());
    }

}