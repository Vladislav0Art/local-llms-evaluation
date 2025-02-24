package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetHasIndexTest {

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        assertFalse(decoder.getHasIndex());
    }

}