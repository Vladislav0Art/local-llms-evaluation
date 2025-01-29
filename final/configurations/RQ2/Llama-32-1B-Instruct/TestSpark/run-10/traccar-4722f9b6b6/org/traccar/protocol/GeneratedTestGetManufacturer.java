package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class GeneratedTestGetManufacturer {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);

    @Test
    public void testGetManufacturer() {
        assertEquals("TRACCA", decoder.getManufacturer());
    }

}