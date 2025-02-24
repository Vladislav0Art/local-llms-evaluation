package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestGetHasIndex {

    private WatchProtocolDecoder decoder;

    @Before
    public void setUp() {
        decoder = new WatchProtocolDecoder(mock(Protocol.class));
    }

    @Test
    public void testGetHasIndex() {
        assertEquals(true, decoder.getHasIndex());
    }

}