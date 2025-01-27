package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.regex.Pattern;

public class GeneratedTestGetHasIndex {

    @org.junit.Before
    public void setUp() {
        // setup necessary variables and mock objects
        WatchProtocolDecoder channel = new WatchProtocolDecoder();
        SocketAddress remoteAddress = null;
    }

    @Test
    public void testGetHasIndex() {
        boolean result = when(channel.getHasIndex()).thenReturn(true);
        assertTrue(result);
        assertEquals(true, channel.getHasIndex());
    }

}