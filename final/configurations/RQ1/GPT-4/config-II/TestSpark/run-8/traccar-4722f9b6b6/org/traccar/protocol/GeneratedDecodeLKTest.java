package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Command;
import org.traccar.protocol.WatchProtocolEncoder;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodeLKTest {

    private WatchProtocolDecoder decoder;

    @Test
    public void decodeLKTest() {
        assertEquals("LK", decode(channel, remoteAddress, msg));
    }

}