package org.traccar.protocol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class GeneratedTest {

    private WatchProtocolDecoder watchProtocolDecoder;

    @Before
    public void setUp() throws Exception {
        watchProtocolDecoder = new WatchProtocolDecoder(new WatchProtocol());
    }

    @Test
    public void getHasIndexTest() {
        assertEquals(false, watchProtocolDecoder.getHasIndex());
    }

    @Test
    public void getManufacturerTest() {
        assertEquals("Watch", watchProtocolDecoder.getManufacturer());
    }

}