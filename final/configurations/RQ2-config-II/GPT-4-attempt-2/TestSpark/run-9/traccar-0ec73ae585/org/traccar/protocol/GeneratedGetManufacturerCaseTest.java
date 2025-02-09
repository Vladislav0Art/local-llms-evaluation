package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;

import junit.framework.TestCase;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetManufacturerCaseTest {

    @Test
    public void getManufacturerCaseTest() {
        WatchProtocolDecoder protocolDecoder = new WatchProtocolDecoder(new Protocol("WatchProtocol"));
        assertEquals("Watch Protocol", protocolDecoder.getManufacturer());
    }

}