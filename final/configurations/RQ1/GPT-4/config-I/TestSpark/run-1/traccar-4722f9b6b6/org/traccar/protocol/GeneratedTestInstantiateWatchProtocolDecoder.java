package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.protocol.WatchProtocolDecoder;

public class GeneratedTestInstantiateWatchProtocolDecoder {

    @Test
    public void testInstantiateWatchProtocolDecoder() {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Assert.assertNotNull(decoder);
    }

}