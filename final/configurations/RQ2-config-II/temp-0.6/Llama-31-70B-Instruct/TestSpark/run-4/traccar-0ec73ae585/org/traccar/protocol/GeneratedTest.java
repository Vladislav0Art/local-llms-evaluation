package org.traccar.protocol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testDecodeWithIndexAndManufacturer() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        assertEquals(false, decoder.getHasIndex());
        assertEquals("Watch", decoder.getManufacturer());
    }

}