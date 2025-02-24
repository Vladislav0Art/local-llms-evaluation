package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.protocol.WatchProtocolDecoder;

import static org.junit.Assert.assertEquals;

public class GeneratedTestDecode {

    private WatchProtocolDecoder watchProtocolDecoder;

    @Test
    public void testDecode() {
        watchProtocolDecoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        assertEquals("", watchProtocolDecoder.decode(Mockito.mock(Channel.class), Mockito.mock(SocketAddress.class), ""));
    }

}