package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Context;

public class GeneratedGetHasIndexTest {

    // creates a new WatchProtocolDecoder object with specified protocol

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("testProtocol"));
        assertFalse(decoder.getHasIndex());

        // setHasIndex is a mock method to simulate setting the hasIndex property
        decoder.setHasIndex(true);

        assertTrue(decoder.getHasIndex());
    }

}