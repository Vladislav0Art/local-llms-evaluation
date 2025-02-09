package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.netty.channel.Channel;

import java.net.SocketAddress;

public class GeneratedGetManufacturerTest {

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        assertEquals("Unknown", decoder.getManufacturer());
    }

}