package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.regex.Pattern;

public class GeneratedTestGetProtocol {

    @org.junit.Before
    public void setUp() {
        // setup necessary variables and mock objects
        WatchProtocolDecoder channel = new WatchProtocolDecoder();
        SocketAddress remoteAddress = null;
    }

    @Test
    public void testGetProtocol() {
        Object obj = new Object();
        when(channel.getProtocol()).thenReturn(obj);
        assertEquals(obj, channel.getProtocol());
    }

    @org.junit.Test
    public void testGetManufacturer() {
        // create a non-static instance of the class being tested
        WatchProtocolDecoder channel = new WatchProtocolDealer();

        // invoke the method being tested
        when(channel.getManufacturer()).thenReturn("Watch Protocol");
        assertEquals("Watch Protocol", channel.getManufacturer());
    }

}