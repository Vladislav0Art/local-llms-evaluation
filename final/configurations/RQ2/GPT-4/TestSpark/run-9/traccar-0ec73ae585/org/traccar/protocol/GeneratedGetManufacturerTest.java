package org.traccar.protocol;

import org.junit.Test;
import org.traccar.BaseProtocol;

import static org.junit.Assert.*;

import java.net.InetSocketAddress;

import io.netty.channel.Channel;

import static org.mockito.Mockito.*;

public class GeneratedGetManufacturerTest {

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new BaseProtocol("watch"));
        assertEquals("Unknown", decoder.getManufacturer());
    }

}