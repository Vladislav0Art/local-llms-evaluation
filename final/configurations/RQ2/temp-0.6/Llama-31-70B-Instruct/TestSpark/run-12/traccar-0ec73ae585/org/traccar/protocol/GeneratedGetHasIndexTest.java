package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedGetHasIndexTest {

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        assertEquals(false, decoder.getHasIndex());
    }

}