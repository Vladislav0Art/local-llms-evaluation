package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.helper.Parser;
import org.traccar.model.Position;

import java.net.SocketAddress;

public class GeneratedGetManufacturerTest {

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        assertEquals("Unknown", decoder.getManufacturer());
    }

}