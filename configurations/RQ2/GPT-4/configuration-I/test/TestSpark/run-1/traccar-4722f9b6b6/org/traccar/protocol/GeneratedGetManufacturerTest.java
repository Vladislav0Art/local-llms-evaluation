package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.traccar.Protocol;
import io.netty.channel.Channel;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

public class GeneratedGetManufacturerTest {

    @Test
    public void getManufacturerTest() {
        Protocol mockProtocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(mockProtocol);

        String manufacturer = decoder.getManufacturer();

        Assert.assertEquals("", manufacturer);
    }

}