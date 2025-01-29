package org.traccar.protocol;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestGetManufacturer {

    private Protocol protocol;

    @Before
    public void setUp() {
        protocol = new Protocol();
    }

    @After
    public void tearDown() {
        protocol = null;
    }

    @Test
    public void testGetManufacturer() {
        MockWatchProtocolDecoder mockWatchProtocolDecoder = new MockWatchProtocolDecoder(protocol);
        assertEquals("TRACCA", mockWatchProtocolDecoder.getManufacturer());
    }

}