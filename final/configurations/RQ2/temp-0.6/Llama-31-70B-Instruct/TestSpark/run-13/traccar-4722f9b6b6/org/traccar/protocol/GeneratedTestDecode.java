package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.BaseProtocolDecoder;
import org.traccar.Protocol;
import org.traccar.protocol.WatchProtocolDecoder;

import static org.junit.Assert.*;

import io.netty.channel.Channel;

import java.net.SocketAddress;

public class GeneratedTestDecode {

    @Test
    public void testDecode() throws Exception {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        assertNotNull(watchProtocolDecoder.decode(Mockito.mock(Channel.class), Mockito.mock(SocketAddress.class), Mockito.mock(Object.class)));
    }

}