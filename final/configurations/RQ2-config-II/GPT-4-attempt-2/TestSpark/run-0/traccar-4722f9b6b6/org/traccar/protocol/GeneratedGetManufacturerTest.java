package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.mockito.Mockito;
import org.traccar.Protocol;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.net.InetSocketAddress;

public class GeneratedGetManufacturerTest {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10); // each test must finish within 10 seconds

    @Test
    public void getManufacturerTest() throws Exception {
        Protocol protocol = new Protocol("test");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        assertEquals("ExpectedManufacturer", decoder.getManufacturer());
    }

}