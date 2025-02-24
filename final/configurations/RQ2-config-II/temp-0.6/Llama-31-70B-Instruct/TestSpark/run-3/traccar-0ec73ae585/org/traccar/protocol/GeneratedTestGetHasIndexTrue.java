package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;

import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class GeneratedTestGetHasIndexTrue {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(new WatchProtocol());

    @Test
    public void testGetHasIndexTrue() {
        assertEquals(true, decoder.getHasIndex());
    }

}