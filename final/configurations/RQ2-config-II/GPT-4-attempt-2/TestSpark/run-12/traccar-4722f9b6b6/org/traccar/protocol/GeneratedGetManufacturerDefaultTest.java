package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.SocketAddress;

public class GeneratedGetManufacturerDefaultTest {

    @Test
    public void getManufacturerDefaultTest() {
        Protocol protocol = new Protocol("testProtocol");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertNull(decoder.getManufacturer());
    }

}