package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Command;
import org.traccar.protocol.WatchProtocolEncoder;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodeTEMPTest {

    private WatchProtocolDecoder decoder;

    @Test
    public void decodeTEMPTest() {
        assertEquals("TEMP", decode(channel, remoteAddress, msg));
    }

}