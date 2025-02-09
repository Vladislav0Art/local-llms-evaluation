package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Context;

public class GeneratedWatchProtocolDecoderConstructorTest {

    // creates a new WatchProtocolDecoder object with specified protocol

    @Test
    public void WatchProtocolDecoderConstructorTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("testProtocol"));

        assertNotNull(decoder);
        assertEquals("testProtocol", decoder.getProtocol());
    }

}