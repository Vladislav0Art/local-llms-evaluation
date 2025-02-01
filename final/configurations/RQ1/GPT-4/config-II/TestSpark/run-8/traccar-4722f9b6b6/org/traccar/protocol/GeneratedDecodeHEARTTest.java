package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Command;
import org.traccar.protocol.WatchProtocolEncoder;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodeHEARTTest {

    private WatchProtocolDecoder decoder;

    @Test
    public void decodeHEARTTest() {
        assertEquals("HEART", decode(channel, remoteAddress, msg));
    }

}