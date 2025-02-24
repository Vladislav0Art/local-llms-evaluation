package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.protocol.WatchProtocolDecoder;

import static org.junit.Assert.*;

import io.netty.channel.Channel;

import java.net.SocketAddress;

public class GeneratedTestGetManufacturer {

    @Test
    public void testGetManufacturer() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        assertEquals("Watch", watchProtocolDecoder.getManufacturer());
    }

}