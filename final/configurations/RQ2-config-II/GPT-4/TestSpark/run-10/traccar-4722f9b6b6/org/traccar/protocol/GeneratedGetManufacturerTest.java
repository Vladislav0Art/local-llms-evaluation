package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import io.netty.channel.Channel;
import org.traccar.Protocol;

import java.net.SocketAddress;

public class GeneratedGetManufacturerTest {

    @Test
    public void getManufacturerTest() {
        Protocol protocol = new Protocol("Test") {
        };
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertEquals("", decoder.getManufacturer());
    }

}