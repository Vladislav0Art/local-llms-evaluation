package org.traccar.protocol;

import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

public class GeneratedGetManufacturerSpecificTest {

    private static Protocol protocolMock = Mockito.mock(Protocol.class);

    @Test
    public void getManufacturerSpecificTest() {
        Mockito.when(protocolMock.getName()).thenReturn("ManufacturerName");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocolMock);
        Assert.assertEquals("ManufacturerName", decoder.getManufacturer());
    }

}