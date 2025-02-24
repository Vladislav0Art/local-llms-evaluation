package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import java.net.SocketAddress;

public class GeneratedTestGetHasIndex {

    @Test
    public void testGetHasIndex() {
        WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(Mockito.mock(Protocol.class));
        assertTrue(watchProtocolDecoder.getHasIndex());
    }

}