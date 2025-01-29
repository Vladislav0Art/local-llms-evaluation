package org.traccar.protocol;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class GeneratedTestGetHasIndex {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);

    @Test
    public void testGetHasIndex() {
        assertTrue(decoder.getHasIndex());
    }

}