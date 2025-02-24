package org.traccar.protocol;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedHasIndexTest {

    private WatchProtocolDecoder watchProtocolDecoder = new WatchProtocolDecoder(new Protocol());

    @Test
    public void hasIndexTest() {
        assertEquals(watchProtocolDecoder.getHasIndex(), true);
    }

}